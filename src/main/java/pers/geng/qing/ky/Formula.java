package pers.geng.qing.ky;

import lombok.Builder;
import lombok.Value;

/**
 * Created by Geng Qing on 2019-03-26
 **/
@Builder
@Value
public class Formula {
    private String left;
    private String right;
}
