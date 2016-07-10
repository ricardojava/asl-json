package com.example;

public class Pax implements Comparable<Pax>{
	
	private String name;
	private String lastname;

	private String numsoli;
	private String numra;
	private String numticket;
	
	private String datesoli;
	private String canal;
	private String codstatus;
	private String descstatus;	
	
	private Origin from;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pax [numsoli=" + numsoli + ", numra=" + numra + ", numticket=" + numticket + ", name=" + name
				+ ", lastname=" + lastname + ", datesoli=" + datesoli + ", canal=" + canal + ", codstatus=" + codstatus
				+ ", descstatus=" + descstatus + "," + from + "," + to + "]";
	}

	/**
	 * @return the from
	 */
	public Origin getFrom() {
		return from;
	}

	/**
	 * @param from the from to set
	 */
	public void setFrom(Origin from) {
		this.from = from;
	}

	/**
	 * @return the to
	 */
	public Destino getTo() {
		return to;
	}

	/**
	 * @param to the to to set
	 */
	public void setTo(Destino to) {
		this.to = to;
	}

	private Destino to;

	/**
	 * @return the numsoli
	 */
	public String getNumsoli() {
		return numsoli;
	}

	/**
	 * @param numsoli
	 *            the numsoli to set
	 */
	public void setNumsoli(String numsoli) {
		this.numsoli = numsoli;
	}

	/**
	 * @return the numra
	 */
	public String getNumra() {
		return numra;
	}

	/**
	 * @param numra
	 *            the numra to set
	 */
	public void setNumra(String numra) {
		this.numra = numra;
	}

	/**
	 * @return the numticket
	 */
	public String getNumticket() {
		return numticket;
	}

	/**
	 * @param numticket
	 *            the numticket to set
	 */
	public void setNumticket(String numticket) {
		this.numticket = numticket;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname
	 *            the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the datesoli
	 */
	public String getDatesoli() {
		return datesoli;
	}

	/**
	 * @param datesoli
	 *            the datesoli to set
	 */
	public void setDatesoli(String datesoli) {
		this.datesoli = datesoli;
	}

	/**
	 * @return the canal
	 */
	public String getCanal() {
		return canal;
	}

	/**
	 * @param canal
	 *            the canal to set
	 */
	public void setCanal(String canal) {
		this.canal = canal;
	}

	/**
	 * @return the codstatus
	 */
	public String getCodstatus() {
		return codstatus;
	}

	/**
	 * @param codstatus
	 *            the codstatus to set
	 */
	public void setCodstatus(String codstatus) {
		this.codstatus = codstatus;
	}

	/**
	 * @return the descstatus
	 */
	public String getDescstatus() {
		return descstatus;
	}

	/**
	 * @param descstatus
	 *            the descstatus to set
	 */
	public void setDescstatus(String descstatus) {
		this.descstatus = descstatus;
	}

	@Override
	public int compareTo(Pax o) {
		// TODO Auto-generated method stub
		
		/*if(getName()){
			
			
		}*/
		return 0;
	}


}
