package com.ning.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @Author: Ning
 * @Date:2020/2/26 0026 下午 11:08
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

    private int bookID;

    private String bookName;

    private int bookCounts;

    private String detail;


}
