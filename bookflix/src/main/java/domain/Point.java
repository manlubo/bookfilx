package domain;

import java.sql.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Point {
    private int pointNo;
    private int memberNO;
    private int amount;
    private Date regDate;
}
