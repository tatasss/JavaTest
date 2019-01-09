package HibernateEvent;

import org.hibernate.HibernateException;
import org.hibernate.event.LoadEvent;
import org.hibernate.event.LoadEventListener;
import org.hibernate.event.LockEvent;
import org.hibernate.event.LockEventListener;

public class MonEcouteur implements LoadEventListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Override
	public void onLoad(LoadEvent arg0, LoadType arg1) throws HibernateException {
		// TODO Auto-generated method stub
		System.out.println("Mon ecouteur : Entité chargée :" +arg0.getEntityId());
		
	}

}
