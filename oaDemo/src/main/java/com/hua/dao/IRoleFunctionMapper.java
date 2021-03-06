package com.hua.dao;

import com.hua.domain.RoleFunction;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IRoleFunctionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_role_function
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("roleId") Integer roleId, @Param("funcId") Integer funcId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_role_function
     *
     * @mbg.generated
     */
    int insert(RoleFunction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_role_function
     *
     * @mbg.generated
     */
    List<RoleFunction> selectAll();

	List<RoleFunction> findFunctionByRoleId(@Param("roleId")String roleId);

	int deleteFunctionByRoleId(@Param("roleId")String roleId);

	List<RoleFunction> findRoleListByFuncId(@Param("funcId")String funcId);
}