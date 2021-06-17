package com.zhidisoft.mapper;

import com.zhidisoft.entity.CrmBusiness;
import com.zhidisoft.entity.CrmBusinessExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface CrmBusinessMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table CRM_BUSINESS
	 * @mbg.generated  Thu Mar 15 09:59:41 CST 2018
	 */
	@SelectProvider(type = CrmBusinessSqlProvider.class, method = "countByExample")
	long countByExample(CrmBusinessExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table CRM_BUSINESS
	 * @mbg.generated  Thu Mar 15 09:59:41 CST 2018
	 */
	@DeleteProvider(type = CrmBusinessSqlProvider.class, method = "deleteByExample")
	int deleteByExample(CrmBusinessExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table CRM_BUSINESS
	 * @mbg.generated  Thu Mar 15 09:59:41 CST 2018
	 */
	@Delete({ "delete from CRM_BUSINESS", "where ID = #{id,jdbcType=DECIMAL}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table CRM_BUSINESS
	 * @mbg.generated  Thu Mar 15 09:59:41 CST 2018
	 */
	@Insert({ "insert into CRM_BUSINESS (ID, NAME, ", "ORIGIN, TYPE, ESTIMATEPRICE, ", "CUSTOMERID, CREATORUSERID, ",
			"OWNERUSERID, GAINRATE, ", "TOTALAMOUNT, SUBTOTALVAL, ", "DISCOUNTPRICE, SALESPRICE, ",
			"DUEDATE, GMT_CREATE, ", "GMT_MODIFIED, UPDATEUSERID, ", "STATUSID, TOTALPRICE, ",
			"NEXTSTEP, NEXTSTEPTIME, ", "ISDELETED, DELETEUSERID, ", "DELETETIME, CONTACTSID, ",
			"CONTACTADDRESS, DESCRIPTION, ", "IS_DEL)", "values (#{id,jdbcType=DECIMAL}, #{name,jdbcType=VARCHAR}, ",
			"#{origin,jdbcType=VARCHAR}, #{type,jdbcType=VARCHAR}, #{estimateprice,jdbcType=DECIMAL}, ",
			"#{customerid,jdbcType=DECIMAL}, #{creatoruserid,jdbcType=VARCHAR}, ",
			"#{owneruserid,jdbcType=VARCHAR}, #{gainrate,jdbcType=DECIMAL}, ",
			"#{totalamount,jdbcType=DECIMAL}, #{subtotalval,jdbcType=DECIMAL}, ",
			"#{discountprice,jdbcType=DECIMAL}, #{salesprice,jdbcType=DECIMAL}, ",
			"#{duedate,jdbcType=TIMESTAMP}, #{gmtCreate,jdbcType=TIMESTAMP}, ",
			"#{gmtModified,jdbcType=TIMESTAMP}, #{updateuserid,jdbcType=VARCHAR}, ",
			"#{statusid,jdbcType=VARCHAR}, #{totalprice,jdbcType=DECIMAL}, ",
			"#{nextstep,jdbcType=VARCHAR}, #{nextsteptime,jdbcType=VARCHAR}, ",
			"#{isdeleted,jdbcType=DECIMAL}, #{deleteuserid,jdbcType=VARCHAR}, ",
			"#{deletetime,jdbcType=TIMESTAMP}, #{contactsid,jdbcType=DECIMAL}, ",
			"#{contactaddress,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ", "#{isDel,jdbcType=VARCHAR})" })
	@SelectKey(statement = "SELECT SEQ_CRM_BUSINESS.NEXTVAL from dual", keyProperty = "id", before = true, resultType = Long.class)
	int insert(CrmBusiness record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table CRM_BUSINESS
	 * @mbg.generated  Thu Mar 15 09:59:41 CST 2018
	 */
	@InsertProvider(type = CrmBusinessSqlProvider.class, method = "insertSelective")
	@SelectKey(statement = "SELECT SEQ_CRM_BUSINESS.NEXTVAL from dual", keyProperty = "id", before = true, resultType = Long.class)
	int insertSelective(CrmBusiness record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table CRM_BUSINESS
	 * @mbg.generated  Thu Mar 15 09:59:41 CST 2018
	 */
	@SelectProvider(type = CrmBusinessSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "ID", property = "id", jdbcType = JdbcType.DECIMAL, id = true),
			@Result(column = "NAME", property = "name", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ORIGIN", property = "origin", jdbcType = JdbcType.VARCHAR),
			@Result(column = "TYPE", property = "type", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ESTIMATEPRICE", property = "estimateprice", jdbcType = JdbcType.DECIMAL),
			@Result(column = "CUSTOMERID", property = "customerid", jdbcType = JdbcType.DECIMAL),
			@Result(column = "CREATORUSERID", property = "creatoruserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "OWNERUSERID", property = "owneruserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "GAINRATE", property = "gainrate", jdbcType = JdbcType.DECIMAL),
			@Result(column = "TOTALAMOUNT", property = "totalamount", jdbcType = JdbcType.DECIMAL),
			@Result(column = "SUBTOTALVAL", property = "subtotalval", jdbcType = JdbcType.DECIMAL),
			@Result(column = "DISCOUNTPRICE", property = "discountprice", jdbcType = JdbcType.DECIMAL),
			@Result(column = "SALESPRICE", property = "salesprice", jdbcType = JdbcType.DECIMAL),
			@Result(column = "DUEDATE", property = "duedate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "GMT_CREATE", property = "gmtCreate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "GMT_MODIFIED", property = "gmtModified", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "UPDATEUSERID", property = "updateuserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "STATUSID", property = "statusid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "TOTALPRICE", property = "totalprice", jdbcType = JdbcType.DECIMAL),
			@Result(column = "NEXTSTEP", property = "nextstep", jdbcType = JdbcType.VARCHAR),
			@Result(column = "NEXTSTEPTIME", property = "nextsteptime", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ISDELETED", property = "isdeleted", jdbcType = JdbcType.DECIMAL),
			@Result(column = "DELETEUSERID", property = "deleteuserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "DELETETIME", property = "deletetime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "CONTACTSID", property = "contactsid", jdbcType = JdbcType.DECIMAL),
			@Result(column = "CONTACTADDRESS", property = "contactaddress", jdbcType = JdbcType.VARCHAR),
			@Result(column = "DESCRIPTION", property = "description", jdbcType = JdbcType.VARCHAR),
			@Result(column = "IS_DEL", property = "isDel", jdbcType = JdbcType.VARCHAR) })
	List<CrmBusiness> selectByExample(CrmBusinessExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table CRM_BUSINESS
	 * @mbg.generated  Thu Mar 15 09:59:41 CST 2018
	 */
	@Select({ "select", "ID, NAME, ORIGIN, TYPE, ESTIMATEPRICE, CUSTOMERID, CREATORUSERID, OWNERUSERID, ",
			"GAINRATE, TOTALAMOUNT, SUBTOTALVAL, DISCOUNTPRICE, SALESPRICE, DUEDATE, GMT_CREATE, ",
			"GMT_MODIFIED, UPDATEUSERID, STATUSID, TOTALPRICE, NEXTSTEP, NEXTSTEPTIME, ISDELETED, ",
			"DELETEUSERID, DELETETIME, CONTACTSID, CONTACTADDRESS, DESCRIPTION, IS_DEL", "from CRM_BUSINESS",
			"where ID = #{id,jdbcType=DECIMAL}" })
	@Results({ @Result(column = "ID", property = "id", jdbcType = JdbcType.DECIMAL, id = true),
			@Result(column = "NAME", property = "name", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ORIGIN", property = "origin", jdbcType = JdbcType.VARCHAR),
			@Result(column = "TYPE", property = "type", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ESTIMATEPRICE", property = "estimateprice", jdbcType = JdbcType.DECIMAL),
			@Result(column = "CUSTOMERID", property = "customerid", jdbcType = JdbcType.DECIMAL),
			@Result(column = "CREATORUSERID", property = "creatoruserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "OWNERUSERID", property = "owneruserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "GAINRATE", property = "gainrate", jdbcType = JdbcType.DECIMAL),
			@Result(column = "TOTALAMOUNT", property = "totalamount", jdbcType = JdbcType.DECIMAL),
			@Result(column = "SUBTOTALVAL", property = "subtotalval", jdbcType = JdbcType.DECIMAL),
			@Result(column = "DISCOUNTPRICE", property = "discountprice", jdbcType = JdbcType.DECIMAL),
			@Result(column = "SALESPRICE", property = "salesprice", jdbcType = JdbcType.DECIMAL),
			@Result(column = "DUEDATE", property = "duedate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "GMT_CREATE", property = "gmtCreate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "GMT_MODIFIED", property = "gmtModified", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "UPDATEUSERID", property = "updateuserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "STATUSID", property = "statusid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "TOTALPRICE", property = "totalprice", jdbcType = JdbcType.DECIMAL),
			@Result(column = "NEXTSTEP", property = "nextstep", jdbcType = JdbcType.VARCHAR),
			@Result(column = "NEXTSTEPTIME", property = "nextsteptime", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ISDELETED", property = "isdeleted", jdbcType = JdbcType.DECIMAL),
			@Result(column = "DELETEUSERID", property = "deleteuserid", jdbcType = JdbcType.VARCHAR),
			@Result(column = "DELETETIME", property = "deletetime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "CONTACTSID", property = "contactsid", jdbcType = JdbcType.DECIMAL),
			@Result(column = "CONTACTADDRESS", property = "contactaddress", jdbcType = JdbcType.VARCHAR),
			@Result(column = "DESCRIPTION", property = "description", jdbcType = JdbcType.VARCHAR),
			@Result(column = "IS_DEL", property = "isDel", jdbcType = JdbcType.VARCHAR) })
	CrmBusiness selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table CRM_BUSINESS
	 * @mbg.generated  Thu Mar 15 09:59:41 CST 2018
	 */
	@UpdateProvider(type = CrmBusinessSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") CrmBusiness record, @Param("example") CrmBusinessExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table CRM_BUSINESS
	 * @mbg.generated  Thu Mar 15 09:59:41 CST 2018
	 */
	@UpdateProvider(type = CrmBusinessSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") CrmBusiness record, @Param("example") CrmBusinessExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table CRM_BUSINESS
	 * @mbg.generated  Thu Mar 15 09:59:41 CST 2018
	 */
	@UpdateProvider(type = CrmBusinessSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(CrmBusiness record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table CRM_BUSINESS
	 * @mbg.generated  Thu Mar 15 09:59:41 CST 2018
	 */
	@Update({ "update CRM_BUSINESS", "set NAME = #{name,jdbcType=VARCHAR},", "ORIGIN = #{origin,jdbcType=VARCHAR},",
			"TYPE = #{type,jdbcType=VARCHAR},", "ESTIMATEPRICE = #{estimateprice,jdbcType=DECIMAL},",
			"CUSTOMERID = #{customerid,jdbcType=DECIMAL},", "CREATORUSERID = #{creatoruserid,jdbcType=VARCHAR},",
			"OWNERUSERID = #{owneruserid,jdbcType=VARCHAR},", "GAINRATE = #{gainrate,jdbcType=DECIMAL},",
			"TOTALAMOUNT = #{totalamount,jdbcType=DECIMAL},", "SUBTOTALVAL = #{subtotalval,jdbcType=DECIMAL},",
			"DISCOUNTPRICE = #{discountprice,jdbcType=DECIMAL},", "SALESPRICE = #{salesprice,jdbcType=DECIMAL},",
			"DUEDATE = #{duedate,jdbcType=TIMESTAMP},", "GMT_CREATE = #{gmtCreate,jdbcType=TIMESTAMP},",
			"GMT_MODIFIED = #{gmtModified,jdbcType=TIMESTAMP},", "UPDATEUSERID = #{updateuserid,jdbcType=VARCHAR},",
			"STATUSID = #{statusid,jdbcType=VARCHAR},", "TOTALPRICE = #{totalprice,jdbcType=DECIMAL},",
			"NEXTSTEP = #{nextstep,jdbcType=VARCHAR},", "NEXTSTEPTIME = #{nextsteptime,jdbcType=VARCHAR},",
			"ISDELETED = #{isdeleted,jdbcType=DECIMAL},", "DELETEUSERID = #{deleteuserid,jdbcType=VARCHAR},",
			"DELETETIME = #{deletetime,jdbcType=TIMESTAMP},", "CONTACTSID = #{contactsid,jdbcType=DECIMAL},",
			"CONTACTADDRESS = #{contactaddress,jdbcType=VARCHAR},", "DESCRIPTION = #{description,jdbcType=VARCHAR},",
			"IS_DEL = #{isDel,jdbcType=VARCHAR}", "where ID = #{id,jdbcType=DECIMAL}" })
	int updateByPrimaryKey(CrmBusiness record);
	
	@Select("SELECT *\r\n" + 
			"  FROM (SELECT A.*, ROWNUM RN\r\n" + 
			"          FROM (select * from crm_business) A\r\n" + 
			"         WHERE <= #{endIndex})\r\n" + 
			" WHERE RN > startIndex")
	@Results({ @Result(column = "ID", property = "id", jdbcType = JdbcType.DECIMAL, id = true),
		@Result(column = "NAME", property = "name", jdbcType = JdbcType.VARCHAR),
		@Result(column = "ORIGIN", property = "origin", jdbcType = JdbcType.VARCHAR),
		@Result(column = "TYPE", property = "type", jdbcType = JdbcType.VARCHAR),
		@Result(column = "ESTIMATEPRICE", property = "estimateprice", jdbcType = JdbcType.DECIMAL),
		@Result(column = "CUSTOMERID", property = "customerid", jdbcType = JdbcType.DECIMAL),
		@Result(column = "CREATORUSERID", property = "creatoruserid", jdbcType = JdbcType.VARCHAR),
		@Result(column = "OWNERUSERID", property = "owneruserid", jdbcType = JdbcType.VARCHAR),
		@Result(column = "GAINRATE", property = "gainrate", jdbcType = JdbcType.DECIMAL),
		@Result(column = "TOTALAMOUNT", property = "totalamount", jdbcType = JdbcType.DECIMAL),
		@Result(column = "SUBTOTALVAL", property = "subtotalval", jdbcType = JdbcType.DECIMAL),
		@Result(column = "DISCOUNTPRICE", property = "discountprice", jdbcType = JdbcType.DECIMAL),
		@Result(column = "SALESPRICE", property = "salesprice", jdbcType = JdbcType.DECIMAL),
		@Result(column = "DUEDATE", property = "duedate", jdbcType = JdbcType.TIMESTAMP),
		@Result(column = "GMT_CREATE", property = "gmtCreate", jdbcType = JdbcType.TIMESTAMP),
		@Result(column = "GMT_MODIFIED", property = "gmtModified", jdbcType = JdbcType.TIMESTAMP),
		@Result(column = "UPDATEUSERID", property = "updateuserid", jdbcType = JdbcType.VARCHAR),
		@Result(column = "STATUSID", property = "statusid", jdbcType = JdbcType.VARCHAR),
		@Result(column = "TOTALPRICE", property = "totalprice", jdbcType = JdbcType.DECIMAL),
		@Result(column = "NEXTSTEP", property = "nextstep", jdbcType = JdbcType.VARCHAR),
		@Result(column = "NEXTSTEPTIME", property = "nextsteptime", jdbcType = JdbcType.VARCHAR),
		@Result(column = "ISDELETED", property = "isdeleted", jdbcType = JdbcType.DECIMAL),
		@Result(column = "DELETEUSERID", property = "deleteuserid", jdbcType = JdbcType.VARCHAR),
		@Result(column = "DELETETIME", property = "deletetime", jdbcType = JdbcType.TIMESTAMP),
		@Result(column = "CONTACTSID", property = "contactsid", jdbcType = JdbcType.DECIMAL),
		@Result(column = "CONTACTADDRESS", property = "contactaddress", jdbcType = JdbcType.VARCHAR),
		@Result(column = "DESCRIPTION", property = "description", jdbcType = JdbcType.VARCHAR),
		@Result(column = "IS_DEL", property = "isDel", jdbcType = JdbcType.VARCHAR) })
	List<CrmBusiness> findPage(@Param("startIndex")Integer startIndex,@Param("endIndex")Integer endIndex);
	
	@Select("select count(u.id) from crm_business u")
	Long findCount();
}