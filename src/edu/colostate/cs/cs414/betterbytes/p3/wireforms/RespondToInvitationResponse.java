package edu.colostate.cs.cs414.betterbytes.p3.wireforms;

import java.io.Serializable;

public class RespondToInvitationResponse implements Message, Protocol, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3074605210833532094L;
	private final String type = Protocol.RESPOND_TO_INVITATION_RESPONSE;
	
	
	private String status;
	private String message;
	
	public RespondToInvitationResponse(String status, String message)
	{
		this.status = status;
		this.message = message;
	}
	
	public String getStatus() {return status;}
	public String getMessage() {return message;}
	
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}

}
