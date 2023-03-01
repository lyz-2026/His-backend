package com.lyz.his.po;

public class ResponseBean<T>
{
    private T data;
    private String msg;
    private Integer code;

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public Integer getCode()
    {
        return code;
    }

    public void setCode(Integer code)
    {
        this.code = code;
    }

    public ResponseBean(T data, String msg, Integer code)
    {
        super();
        this.data = data;
        this.msg = msg;
        this.code = code;
    }

    public ResponseBean(String msg, Integer code)
    {
        super();
        this.msg = msg;
        this.code = code;
    }

    public ResponseBean(T data)
    {
        super();
        this.data = data;
        this.msg = "ok";
        this.code = 200;
    }

    @Override
    public String toString()
    {
        return "ResponseBean{" + "data=" + data + ", msg='" + msg + '\'' + ", code=" + code + '}';
    }
}
