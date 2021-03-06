/* ****************************************************************************
 * Copyright (c) 2016 EAWAG - Swiss Federal Institute for Aquatic Research 
 *                            and Technology
 *
 * Author: Luís de Sousa [luis.desousa@eawag.ch]
 * Date: 08-02-2016
 * Description:
 * CENTAUR specific Pump Entity.
 * 
 * This software is licenced under the European Union Public Licence V. 1.1,
 * please check the LICENCE file for details or the web page:
 * https://joinup.ec.europa.eu/community/eupl/og_page/eupl
 * ***************************************************************************/
package centaur.in;

import java.math.BigDecimal;
import java.util.Random;

import org.hibernate.Session;

import centaur.in.Link;


// TODO: Auto-generated Javadoc
/**
 * The Class Pump.
 */
public class Pump /*extends centaur.db.Pump*/ implements Importable
{
	
	/** The pump. */
	centaur.db.Pump pump;

	/**
	 * Instantiates a new pump.
	 */
	public Pump() 
	{
		pump = new centaur.db.Pump();
	}

	/**
	 * Instantiates a new pump.
	 *
	 * @param link the link
	 */
	public Pump(Link link) 
	{
		pump = new centaur.db.Pump(link.getPersistentObject());
	}
	
	/* (non-Javadoc)
	 * @see centaur.in.Importable#importFromSWMMLine(java.lang.String, org.hibernate.Session, java.util.Random, int)
	 */
	@Override
	public void importFromSWMMLine(String lineSWMM, Session session, Random generator, int newIdFloor)
	{
		String[] values = lineSWMM.split("\\s+");

		Link l = new Link(values, generator.nextInt() + newIdFloor, session);
		pump = new centaur.db.Pump(l.getPersistentObject());
		if (values.length > 3)
		{
			Curve c = new Curve();
			if(c.loadFromName(session, values[3])) 
				pump.setCurve(c.getPersistentObject());
		}
		if (values.length > 4) pump.setStatus(values[4]);
		if (values.length > 5) pump.setStartup(new BigDecimal(values[5]));
		if (values.length > 6) pump.setShutoff(new BigDecimal(values[6]));
		session.save(l.getPersistentObject());
		session.save(pump);
	}

}
