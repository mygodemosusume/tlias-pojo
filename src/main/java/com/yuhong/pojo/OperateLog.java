package com.yuhong.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * ClassName: Log
 * Package: com.yuhong.pojo
 * Description:
 *
 * @Author 洪宇
 * @Create 28/10/2023 1:05 AM
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OperateLog {

    private Integer id;
    private Integer operateUser;
    private LocalDateTime operateTime;
    private String className;
    private String methodName;
    private String methodParams;
    private String returnValue;
    private Long costTime;


}
