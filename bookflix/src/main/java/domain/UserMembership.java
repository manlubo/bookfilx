package domain;

import java.sql.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserMembership {
	private int userMembershipNo;
	private int memberNo;
	private int membershipNo;
	private Date start_date;
	private Date end_date;
}
