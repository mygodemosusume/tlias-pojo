package com.yuhong.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * ClassName: PageBean
 * Package: com.yuhong.pojo
 * Description:
 *
 * @Author 洪宇
 * @Create 22/10/2023 3:45 PM
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageBean {
    Long total;
    List<Emp> rows;
}
