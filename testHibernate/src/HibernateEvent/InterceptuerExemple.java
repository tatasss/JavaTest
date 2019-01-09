package HibernateEvent;

import java.io.Serializable;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;

public class InterceptuerExemple  extends EmptyInterceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public boolean onLoad(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
		// TODO Auto-generated method stub
		System.out.println("chargement de l'objet :" + entity);
		return false;
		//return super.onLoad(entity, id, state, propertyNames, types);
		
	}
	
	

}
