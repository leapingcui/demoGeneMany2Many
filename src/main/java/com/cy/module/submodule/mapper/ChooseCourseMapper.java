package com.cy.module.submodule.mapper;

import com.cy.module.submodule.entity.ChooseCourse;
import com.cy.module.submodule.entity.ChooseCourseExample;
import com.cy.module.submodule.entity.ChooseCourseMulti;
import com.cy.module.submodule.entity.ChooseCourseMultiExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChooseCourseMapper {
    int countByExample(ChooseCourseExample example);

    int deleteByExample(ChooseCourseExample example);

    int deleteByPrimaryKey(Integer ccSid,String ccCid);

    int insert(ChooseCourse record);

    int insertSelective(ChooseCourse record);

    List<ChooseCourseMulti> selectMultiByExample(ChooseCourseMultiExample chooseCourseMultiExample);
    List<ChooseCourse> selectByExample(ChooseCourseExample example);

    ChooseCourse selectByPrimaryKey(Integer ccSid,String ccCid);

    int updateByExampleSelective(@Param("record") ChooseCourse record, @Param("example") ChooseCourseExample example);

    int updateByExample(@Param("record") ChooseCourse record, @Param("example") ChooseCourseExample example);

    int updateByPrimaryKeySelective(ChooseCourse record);

    int updateByPrimaryKey(ChooseCourse record);
}