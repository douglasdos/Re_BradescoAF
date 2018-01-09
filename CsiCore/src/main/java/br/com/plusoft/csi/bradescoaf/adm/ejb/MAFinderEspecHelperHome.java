package br.com.plusoft.csi.bradescoaf.adm.ejb;
/**
 * Home interface for Enterprise Bean: MAFinderEspecHelper
 */
public interface MAFinderEspecHelperHome extends javax.ejb.EJBHome {
	
	public MAFinderEspecHelper create()
			throws javax.ejb.CreateException, java.rmi.RemoteException;
}
