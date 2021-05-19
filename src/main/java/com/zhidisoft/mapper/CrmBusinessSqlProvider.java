package com.zhidisoft.mapper;

import com.zhidisoft.entity.CrmBusiness;
import com.zhidisoft.entity.CrmBusinessExample.Criteria;
import com.zhidisoft.entity.CrmBusinessExample.Criterion;
import com.zhidisoft.entity.CrmBusinessExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class CrmBusinessSqlProvider {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table CRM_BUSINESS
	 * @mbg.generated  Thu Mar 15 09:59:41 CST 2018
	 */
	public String countByExample(CrmBusinessExample example) {
		SQL sql = new SQL();
		sql.SELECT("count(*)").FROM("CRM_BUSINESS");
		applyWhere(sql, example, false);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table CRM_BUSINESS
	 * @mbg.generated  Thu Mar 15 09:59:41 CST 2018
	 */
	public String deleteByExample(CrmBusinessExample example) {
		SQL sql = new SQL();
		sql.DELETE_FROM("CRM_BUSINESS");
		applyWhere(sql, example, false);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table CRM_BUSINESS
	 * @mbg.generated  Thu Mar 15 09:59:41 CST 2018
	 */
	public String insertSelective(CrmBusiness record) {
		SQL sql = new SQL();
		sql.INSERT_INTO("CRM_BUSINESS");
		sql.VALUES("ID", "#{id,jdbcType=DECIMAL}");
		if (record.getName() != null) {
			sql.VALUES("NAME", "#{name,jdbcType=VARCHAR}");
		}
		if (record.getOrigin() != null) {
			sql.VALUES("ORIGIN", "#{origin,jdbcType=VARCHAR}");
		}
		if (record.getType() != null) {
			sql.VALUES("TYPE", "#{type,jdbcType=VARCHAR}");
		}
		if (record.getEstimateprice() != null) {
			sql.VALUES("ESTIMATEPRICE", "#{estimateprice,jdbcType=DECIMAL}");
		}
		if (record.getCustomerid() != null) {
			sql.VALUES("CUSTOMERID", "#{customerid,jdbcType=DECIMAL}");
		}
		if (record.getCreatoruserid() != null) {
			sql.VALUES("CREATORUSERID", "#{creatoruserid,jdbcType=VARCHAR}");
		}
		if (record.getOwneruserid() != null) {
			sql.VALUES("OWNERUSERID", "#{owneruserid,jdbcType=VARCHAR}");
		}
		if (record.getGainrate() != null) {
			sql.VALUES("GAINRATE", "#{gainrate,jdbcType=DECIMAL}");
		}
		if (record.getTotalamount() != null) {
			sql.VALUES("TOTALAMOUNT", "#{totalamount,jdbcType=DECIMAL}");
		}
		if (record.getSubtotalval() != null) {
			sql.VALUES("SUBTOTALVAL", "#{subtotalval,jdbcType=DECIMAL}");
		}
		if (record.getDiscountprice() != null) {
			sql.VALUES("DISCOUNTPRICE", "#{discountprice,jdbcType=DECIMAL}");
		}
		if (record.getSalesprice() != null) {
			sql.VALUES("SALESPRICE", "#{salesprice,jdbcType=DECIMAL}");
		}
		if (record.getDuedate() != null) {
			sql.VALUES("DUEDATE", "#{duedate,jdbcType=TIMESTAMP}");
		}
		if (record.getGmtCreate() != null) {
			sql.VALUES("GMT_CREATE", "#{gmtCreate,jdbcType=TIMESTAMP}");
		}
		if (record.getGmtModified() != null) {
			sql.VALUES("GMT_MODIFIED", "#{gmtModified,jdbcType=TIMESTAMP}");
		}
		if (record.getUpdateuserid() != null) {
			sql.VALUES("UPDATEUSERID", "#{updateuserid,jdbcType=VARCHAR}");
		}
		if (record.getStatusid() != null) {
			sql.VALUES("STATUSID", "#{statusid,jdbcType=VARCHAR}");
		}
		if (record.getTotalprice() != null) {
			sql.VALUES("TOTALPRICE", "#{totalprice,jdbcType=DECIMAL}");
		}
		if (record.getNextstep() != null) {
			sql.VALUES("NEXTSTEP", "#{nextstep,jdbcType=VARCHAR}");
		}
		if (record.getNextsteptime() != null) {
			sql.VALUES("NEXTSTEPTIME", "#{nextsteptime,jdbcType=VARCHAR}");
		}
		if (record.getIsdeleted() != null) {
			sql.VALUES("ISDELETED", "#{isdeleted,jdbcType=DECIMAL}");
		}
		if (record.getDeleteuserid() != null) {
			sql.VALUES("DELETEUSERID", "#{deleteuserid,jdbcType=VARCHAR}");
		}
		if (record.getDeletetime() != null) {
			sql.VALUES("DELETETIME", "#{deletetime,jdbcType=TIMESTAMP}");
		}
		if (record.getContactsid() != null) {
			sql.VALUES("CONTACTSID", "#{contactsid,jdbcType=DECIMAL}");
		}
		if (record.getContactaddress() != null) {
			sql.VALUES("CONTACTADDRESS", "#{contactaddress,jdbcType=VARCHAR}");
		}
		if (record.getDescription() != null) {
			sql.VALUES("DESCRIPTION", "#{description,jdbcType=VARCHAR}");
		}
		if (record.getIsDel() != null) {
			sql.VALUES("IS_DEL", "#{isDel,jdbcType=VARCHAR}");
		}
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table CRM_BUSINESS
	 * @mbg.generated  Thu Mar 15 09:59:41 CST 2018
	 */
	public String selectByExample(CrmBusinessExample example) {
		SQL sql = new SQL();
		if (example != null && example.isDistinct()) {
			sql.SELECT_DISTINCT("ID");
		} else {
			sql.SELECT("ID");
		}
		sql.SELECT("NAME");
		sql.SELECT("ORIGIN");
		sql.SELECT("TYPE");
		sql.SELECT("ESTIMATEPRICE");
		sql.SELECT("CUSTOMERID");
		sql.SELECT("CREATORUSERID");
		sql.SELECT("OWNERUSERID");
		sql.SELECT("GAINRATE");
		sql.SELECT("TOTALAMOUNT");
		sql.SELECT("SUBTOTALVAL");
		sql.SELECT("DISCOUNTPRICE");
		sql.SELECT("SALESPRICE");
		sql.SELECT("DUEDATE");
		sql.SELECT("GMT_CREATE");
		sql.SELECT("GMT_MODIFIED");
		sql.SELECT("UPDATEUSERID");
		sql.SELECT("STATUSID");
		sql.SELECT("TOTALPRICE");
		sql.SELECT("NEXTSTEP");
		sql.SELECT("NEXTSTEPTIME");
		sql.SELECT("ISDELETED");
		sql.SELECT("DELETEUSERID");
		sql.SELECT("DELETETIME");
		sql.SELECT("CONTACTSID");
		sql.SELECT("CONTACTADDRESS");
		sql.SELECT("DESCRIPTION");
		sql.SELECT("IS_DEL");
		sql.FROM("CRM_BUSINESS");
		applyWhere(sql, example, false);
		if (example != null && example.getOrderByClause() != null) {
			sql.ORDER_BY(example.getOrderByClause());
		}
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table CRM_BUSINESS
	 * @mbg.generated  Thu Mar 15 09:59:41 CST 2018
	 */
	public String updateByExampleSelective(Map<String, Object> parameter) {
		CrmBusiness record = (CrmBusiness) parameter.get("record");
		CrmBusinessExample example = (CrmBusinessExample) parameter.get("example");
		SQL sql = new SQL();
		sql.UPDATE("CRM_BUSINESS");
		if (record.getId() != null) {
			sql.SET("ID = #{record.id,jdbcType=DECIMAL}");
		}
		if (record.getName() != null) {
			sql.SET("NAME = #{record.name,jdbcType=VARCHAR}");
		}
		if (record.getOrigin() != null) {
			sql.SET("ORIGIN = #{record.origin,jdbcType=VARCHAR}");
		}
		if (record.getType() != null) {
			sql.SET("TYPE = #{record.type,jdbcType=VARCHAR}");
		}
		if (record.getEstimateprice() != null) {
			sql.SET("ESTIMATEPRICE = #{record.estimateprice,jdbcType=DECIMAL}");
		}
		if (record.getCustomerid() != null) {
			sql.SET("CUSTOMERID = #{record.customerid,jdbcType=DECIMAL}");
		}
		if (record.getCreatoruserid() != null) {
			sql.SET("CREATORUSERID = #{record.creatoruserid,jdbcType=VARCHAR}");
		}
		if (record.getOwneruserid() != null) {
			sql.SET("OWNERUSERID = #{record.owneruserid,jdbcType=VARCHAR}");
		}
		if (record.getGainrate() != null) {
			sql.SET("GAINRATE = #{record.gainrate,jdbcType=DECIMAL}");
		}
		if (record.getTotalamount() != null) {
			sql.SET("TOTALAMOUNT = #{record.totalamount,jdbcType=DECIMAL}");
		}
		if (record.getSubtotalval() != null) {
			sql.SET("SUBTOTALVAL = #{record.subtotalval,jdbcType=DECIMAL}");
		}
		if (record.getDiscountprice() != null) {
			sql.SET("DISCOUNTPRICE = #{record.discountprice,jdbcType=DECIMAL}");
		}
		if (record.getSalesprice() != null) {
			sql.SET("SALESPRICE = #{record.salesprice,jdbcType=DECIMAL}");
		}
		if (record.getDuedate() != null) {
			sql.SET("DUEDATE = #{record.duedate,jdbcType=TIMESTAMP}");
		}
		if (record.getGmtCreate() != null) {
			sql.SET("GMT_CREATE = #{record.gmtCreate,jdbcType=TIMESTAMP}");
		}
		if (record.getGmtModified() != null) {
			sql.SET("GMT_MODIFIED = #{record.gmtModified,jdbcType=TIMESTAMP}");
		}
		if (record.getUpdateuserid() != null) {
			sql.SET("UPDATEUSERID = #{record.updateuserid,jdbcType=VARCHAR}");
		}
		if (record.getStatusid() != null) {
			sql.SET("STATUSID = #{record.statusid,jdbcType=VARCHAR}");
		}
		if (record.getTotalprice() != null) {
			sql.SET("TOTALPRICE = #{record.totalprice,jdbcType=DECIMAL}");
		}
		if (record.getNextstep() != null) {
			sql.SET("NEXTSTEP = #{record.nextstep,jdbcType=VARCHAR}");
		}
		if (record.getNextsteptime() != null) {
			sql.SET("NEXTSTEPTIME = #{record.nextsteptime,jdbcType=VARCHAR}");
		}
		if (record.getIsdeleted() != null) {
			sql.SET("ISDELETED = #{record.isdeleted,jdbcType=DECIMAL}");
		}
		if (record.getDeleteuserid() != null) {
			sql.SET("DELETEUSERID = #{record.deleteuserid,jdbcType=VARCHAR}");
		}
		if (record.getDeletetime() != null) {
			sql.SET("DELETETIME = #{record.deletetime,jdbcType=TIMESTAMP}");
		}
		if (record.getContactsid() != null) {
			sql.SET("CONTACTSID = #{record.contactsid,jdbcType=DECIMAL}");
		}
		if (record.getContactaddress() != null) {
			sql.SET("CONTACTADDRESS = #{record.contactaddress,jdbcType=VARCHAR}");
		}
		if (record.getDescription() != null) {
			sql.SET("DESCRIPTION = #{record.description,jdbcType=VARCHAR}");
		}
		if (record.getIsDel() != null) {
			sql.SET("IS_DEL = #{record.isDel,jdbcType=VARCHAR}");
		}
		applyWhere(sql, example, true);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table CRM_BUSINESS
	 * @mbg.generated  Thu Mar 15 09:59:41 CST 2018
	 */
	public String updateByExample(Map<String, Object> parameter) {
		SQL sql = new SQL();
		sql.UPDATE("CRM_BUSINESS");
		sql.SET("ID = #{record.id,jdbcType=DECIMAL}");
		sql.SET("NAME = #{record.name,jdbcType=VARCHAR}");
		sql.SET("ORIGIN = #{record.origin,jdbcType=VARCHAR}");
		sql.SET("TYPE = #{record.type,jdbcType=VARCHAR}");
		sql.SET("ESTIMATEPRICE = #{record.estimateprice,jdbcType=DECIMAL}");
		sql.SET("CUSTOMERID = #{record.customerid,jdbcType=DECIMAL}");
		sql.SET("CREATORUSERID = #{record.creatoruserid,jdbcType=VARCHAR}");
		sql.SET("OWNERUSERID = #{record.owneruserid,jdbcType=VARCHAR}");
		sql.SET("GAINRATE = #{record.gainrate,jdbcType=DECIMAL}");
		sql.SET("TOTALAMOUNT = #{record.totalamount,jdbcType=DECIMAL}");
		sql.SET("SUBTOTALVAL = #{record.subtotalval,jdbcType=DECIMAL}");
		sql.SET("DISCOUNTPRICE = #{record.discountprice,jdbcType=DECIMAL}");
		sql.SET("SALESPRICE = #{record.salesprice,jdbcType=DECIMAL}");
		sql.SET("DUEDATE = #{record.duedate,jdbcType=TIMESTAMP}");
		sql.SET("GMT_CREATE = #{record.gmtCreate,jdbcType=TIMESTAMP}");
		sql.SET("GMT_MODIFIED = #{record.gmtModified,jdbcType=TIMESTAMP}");
		sql.SET("UPDATEUSERID = #{record.updateuserid,jdbcType=VARCHAR}");
		sql.SET("STATUSID = #{record.statusid,jdbcType=VARCHAR}");
		sql.SET("TOTALPRICE = #{record.totalprice,jdbcType=DECIMAL}");
		sql.SET("NEXTSTEP = #{record.nextstep,jdbcType=VARCHAR}");
		sql.SET("NEXTSTEPTIME = #{record.nextsteptime,jdbcType=VARCHAR}");
		sql.SET("ISDELETED = #{record.isdeleted,jdbcType=DECIMAL}");
		sql.SET("DELETEUSERID = #{record.deleteuserid,jdbcType=VARCHAR}");
		sql.SET("DELETETIME = #{record.deletetime,jdbcType=TIMESTAMP}");
		sql.SET("CONTACTSID = #{record.contactsid,jdbcType=DECIMAL}");
		sql.SET("CONTACTADDRESS = #{record.contactaddress,jdbcType=VARCHAR}");
		sql.SET("DESCRIPTION = #{record.description,jdbcType=VARCHAR}");
		sql.SET("IS_DEL = #{record.isDel,jdbcType=VARCHAR}");
		CrmBusinessExample example = (CrmBusinessExample) parameter.get("example");
		applyWhere(sql, example, true);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table CRM_BUSINESS
	 * @mbg.generated  Thu Mar 15 09:59:41 CST 2018
	 */
	public String updateByPrimaryKeySelective(CrmBusiness record) {
		SQL sql = new SQL();
		sql.UPDATE("CRM_BUSINESS");
		if (record.getName() != null) {
			sql.SET("NAME = #{name,jdbcType=VARCHAR}");
		}
		if (record.getOrigin() != null) {
			sql.SET("ORIGIN = #{origin,jdbcType=VARCHAR}");
		}
		if (record.getType() != null) {
			sql.SET("TYPE = #{type,jdbcType=VARCHAR}");
		}
		if (record.getEstimateprice() != null) {
			sql.SET("ESTIMATEPRICE = #{estimateprice,jdbcType=DECIMAL}");
		}
		if (record.getCustomerid() != null) {
			sql.SET("CUSTOMERID = #{customerid,jdbcType=DECIMAL}");
		}
		if (record.getCreatoruserid() != null) {
			sql.SET("CREATORUSERID = #{creatoruserid,jdbcType=VARCHAR}");
		}
		if (record.getOwneruserid() != null) {
			sql.SET("OWNERUSERID = #{owneruserid,jdbcType=VARCHAR}");
		}
		if (record.getGainrate() != null) {
			sql.SET("GAINRATE = #{gainrate,jdbcType=DECIMAL}");
		}
		if (record.getTotalamount() != null) {
			sql.SET("TOTALAMOUNT = #{totalamount,jdbcType=DECIMAL}");
		}
		if (record.getSubtotalval() != null) {
			sql.SET("SUBTOTALVAL = #{subtotalval,jdbcType=DECIMAL}");
		}
		if (record.getDiscountprice() != null) {
			sql.SET("DISCOUNTPRICE = #{discountprice,jdbcType=DECIMAL}");
		}
		if (record.getSalesprice() != null) {
			sql.SET("SALESPRICE = #{salesprice,jdbcType=DECIMAL}");
		}
		if (record.getDuedate() != null) {
			sql.SET("DUEDATE = #{duedate,jdbcType=TIMESTAMP}");
		}
		if (record.getGmtCreate() != null) {
			sql.SET("GMT_CREATE = #{gmtCreate,jdbcType=TIMESTAMP}");
		}
		if (record.getGmtModified() != null) {
			sql.SET("GMT_MODIFIED = #{gmtModified,jdbcType=TIMESTAMP}");
		}
		if (record.getUpdateuserid() != null) {
			sql.SET("UPDATEUSERID = #{updateuserid,jdbcType=VARCHAR}");
		}
		if (record.getStatusid() != null) {
			sql.SET("STATUSID = #{statusid,jdbcType=VARCHAR}");
		}
		if (record.getTotalprice() != null) {
			sql.SET("TOTALPRICE = #{totalprice,jdbcType=DECIMAL}");
		}
		if (record.getNextstep() != null) {
			sql.SET("NEXTSTEP = #{nextstep,jdbcType=VARCHAR}");
		}
		if (record.getNextsteptime() != null) {
			sql.SET("NEXTSTEPTIME = #{nextsteptime,jdbcType=VARCHAR}");
		}
		if (record.getIsdeleted() != null) {
			sql.SET("ISDELETED = #{isdeleted,jdbcType=DECIMAL}");
		}
		if (record.getDeleteuserid() != null) {
			sql.SET("DELETEUSERID = #{deleteuserid,jdbcType=VARCHAR}");
		}
		if (record.getDeletetime() != null) {
			sql.SET("DELETETIME = #{deletetime,jdbcType=TIMESTAMP}");
		}
		if (record.getContactsid() != null) {
			sql.SET("CONTACTSID = #{contactsid,jdbcType=DECIMAL}");
		}
		if (record.getContactaddress() != null) {
			sql.SET("CONTACTADDRESS = #{contactaddress,jdbcType=VARCHAR}");
		}
		if (record.getDescription() != null) {
			sql.SET("DESCRIPTION = #{description,jdbcType=VARCHAR}");
		}
		if (record.getIsDel() != null) {
			sql.SET("IS_DEL = #{isDel,jdbcType=VARCHAR}");
		}
		sql.WHERE("ID = #{id,jdbcType=DECIMAL}");
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table CRM_BUSINESS
	 * @mbg.generated  Thu Mar 15 09:59:41 CST 2018
	 */
	protected void applyWhere(SQL sql, CrmBusinessExample example, boolean includeExamplePhrase) {
		if (example == null) {
			return;
		}
		String parmPhrase1;
		String parmPhrase1_th;
		String parmPhrase2;
		String parmPhrase2_th;
		String parmPhrase3;
		String parmPhrase3_th;
		if (includeExamplePhrase) {
			parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
			parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
			parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
			parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
			parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
			parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
		} else {
			parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
			parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
			parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
			parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
			parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
			parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
		}
		StringBuilder sb = new StringBuilder();
		List<Criteria> oredCriteria = example.getOredCriteria();
		boolean firstCriteria = true;
		for (int i = 0; i < oredCriteria.size(); i++) {
			Criteria criteria = oredCriteria.get(i);
			if (criteria.isValid()) {
				if (firstCriteria) {
					firstCriteria = false;
				} else {
					sb.append(" or ");
				}
				sb.append('(');
				List<Criterion> criterions = criteria.getAllCriteria();
				boolean firstCriterion = true;
				for (int j = 0; j < criterions.size(); j++) {
					Criterion criterion = criterions.get(j);
					if (firstCriterion) {
						firstCriterion = false;
					} else {
						sb.append(" and ");
					}
					if (criterion.isNoValue()) {
						sb.append(criterion.getCondition());
					} else if (criterion.isSingleValue()) {
						if (criterion.getTypeHandler() == null) {
							sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
						} else {
							sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,
									criterion.getTypeHandler()));
						}
					} else if (criterion.isBetweenValue()) {
						if (criterion.getTypeHandler() == null) {
							sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
						} else {
							sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j,
									criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
						}
					} else if (criterion.isListValue()) {
						sb.append(criterion.getCondition());
						sb.append(" (");
						List<?> listItems = (List<?>) criterion.getValue();
						boolean comma = false;
						for (int k = 0; k < listItems.size(); k++) {
							if (comma) {
								sb.append(", ");
							} else {
								comma = true;
							}
							if (criterion.getTypeHandler() == null) {
								sb.append(String.format(parmPhrase3, i, j, k));
							} else {
								sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
							}
						}
						sb.append(')');
					}
				}
				sb.append(')');
			}
		}
		if (sb.length() > 0) {
			sql.WHERE(sb.toString());
		}
	}
}