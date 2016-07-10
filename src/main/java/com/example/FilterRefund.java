package com.example;

import java.util.Map;
import java.util.TreeMap;

/**
 * 
 * @author ricardo-almeida
 *
 */

public class FilterRefund {

	private int cod;
	private String msg;
	 private int totalfound;
/*	private List<Pax> refundlist;
*/	Map<String, Pax> refundlist = new TreeMap<String, Pax>();
   

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg
	 *            the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * @return the refundlist
	 */
	/*public List getRefundlist() {
		return refundlist;
	}

	*//**
	 * @param refundlist the refundlist to set
	 *//*
	public void setRefundlist(List refundlist) {
		this.refundlist = refundlist;
	}*/

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FilterRefund [cod=" + cod + ", msg=" + msg + ", refundlist=" + refundlist + "]";
	}

	/**
	 * @return the totalfound
	 */
	public int getTotalfound() {
		return totalfound;
	}

	/**
	 * @param totalfound the totalfound to set
	 */
	public void setTotalfound(int totalfound) {
		this.totalfound = totalfound;
	}
	

}
