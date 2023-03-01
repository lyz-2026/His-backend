package com.lyz.his.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.lyz.his.po.Rule;
import com.lyz.his.po.RuleSub;

@Mapper
public interface RuleDao
{
    // 增加排班规则
    Integer addRule(List<Rule> list);

    // 查询规则列表
    List<Rule> listRule();

    // 按照科室ID查询排班规则
    List<RuleSub> listRuleByDeptId(Integer deptid);

    // 作废排班规则
    Integer delRule(Integer id);

}
