package br.com.plusoft.csi.bradescoaf.adm.ejb;





/**
 * Bean implementation class for Enterprise Bean: MAFinderHelper
 */
public class MAFinderEspecHelperBean implements javax.ejb.SessionBean {
	
	private javax.ejb.SessionContext mySessionCtx;

	/**
	 * getSessionContext
	 */
	public javax.ejb.SessionContext getSessionContext() {
		return mySessionCtx;
	}

	/**
	 * setSessionContext
	 */
	public void setSessionContext(javax.ejb.SessionContext ctx) {
		mySessionCtx = ctx;
	}

	/**
	 * ejbCreate
	 */
	public void ejbCreate() throws javax.ejb.CreateException {}

	/**
	 * ejbActivate
	 */
	public void ejbActivate() {}

	/**
	 * ejbPassivate
	 */
	public void ejbPassivate() {}

	/**
	 * ejbRemove
	 */
	public void ejbRemove() {}
	

}