package entities;
// Generated Jun 6, 2022, 6:02:59 PM by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Ticketclass generated by hbm2java
 */
@Entity
@Table(name = "ticketclass", catalog = "sellticketdb")
public class Ticketclass implements java.io.Serializable {

	private String ticketClassId;
	private String ticketClassType;
	private Set<Ticket> tickets = new HashSet<Ticket>(0);

	public Ticketclass() {
	}

	public Ticketclass(String ticketClassId) {
		this.ticketClassId = ticketClassId;
	}

	public Ticketclass(String ticketClassId, String ticketClassType, Set<Ticket> tickets) {
		this.ticketClassId = ticketClassId;
		this.ticketClassType = ticketClassType;
		this.tickets = tickets;
	}

	@Id

	@Column(name = "TicketClass_ID", unique = true, nullable = false, length = 10)
	public String getTicketClassId() {
		return this.ticketClassId;
	}

	public void setTicketClassId(String ticketClassId) {
		this.ticketClassId = ticketClassId;
	}

	@Column(name = "TicketClassType", length = 50)
	public String getTicketClassType() {
		return this.ticketClassType;
	}

	public void setTicketClassType(String ticketClassType) {
		this.ticketClassType = ticketClassType;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ticketclass")
	public Set<Ticket> getTickets() {
		return this.tickets;
	}

	public void setTickets(Set<Ticket> tickets) {
		this.tickets = tickets;
	}

}
