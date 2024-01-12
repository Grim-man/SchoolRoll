package org.example.roll.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 统一响应结果 Result
 */

@NoArgsConstructor // 无参构造
@AllArgsConstructor // 全参构造
@Data
public class Result<T> {
    private Integer code; // 响应状态码
    private String message; // 响应信息
    private T data; // 响应数据

    // 快速返回操作成功 响应结果 附带响应数据
    public static <E> Result<E> success(E data){
        return new Result<>(200, "success", data);
    }

    // 快速返回操作成功 响应结果 无数据
    public static Result success(){
        return new Result<>(200, "success", null);
    }

    // 快速返回操作失败 响应结果
    public static Result error(){
        return new Result<>(400, "error", null);
    }

}
