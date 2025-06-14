package domain;


import org.apache.ibatis.type.Alias;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Alias("point")
public class Point {
    private Long pono;
    private Long mno;
    private int amount;
    private String regdate;
}
