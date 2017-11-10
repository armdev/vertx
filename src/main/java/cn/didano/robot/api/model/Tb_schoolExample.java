package cn.didano.robot.api.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tb_schoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tb_schoolExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andOccasionIsNull() {
            addCriterion("occasion is null");
            return (Criteria) this;
        }

        public Criteria andOccasionIsNotNull() {
            addCriterion("occasion is not null");
            return (Criteria) this;
        }

        public Criteria andOccasionEqualTo(Integer value) {
            addCriterion("occasion =", value, "occasion");
            return (Criteria) this;
        }

        public Criteria andOccasionNotEqualTo(Integer value) {
            addCriterion("occasion <>", value, "occasion");
            return (Criteria) this;
        }

        public Criteria andOccasionGreaterThan(Integer value) {
            addCriterion("occasion >", value, "occasion");
            return (Criteria) this;
        }

        public Criteria andOccasionGreaterThanOrEqualTo(Integer value) {
            addCriterion("occasion >=", value, "occasion");
            return (Criteria) this;
        }

        public Criteria andOccasionLessThan(Integer value) {
            addCriterion("occasion <", value, "occasion");
            return (Criteria) this;
        }

        public Criteria andOccasionLessThanOrEqualTo(Integer value) {
            addCriterion("occasion <=", value, "occasion");
            return (Criteria) this;
        }

        public Criteria andOccasionIn(List<Integer> values) {
            addCriterion("occasion in", values, "occasion");
            return (Criteria) this;
        }

        public Criteria andOccasionNotIn(List<Integer> values) {
            addCriterion("occasion not in", values, "occasion");
            return (Criteria) this;
        }

        public Criteria andOccasionBetween(Integer value1, Integer value2) {
            addCriterion("occasion between", value1, value2, "occasion");
            return (Criteria) this;
        }

        public Criteria andOccasionNotBetween(Integer value1, Integer value2) {
            addCriterion("occasion not between", value1, value2, "occasion");
            return (Criteria) this;
        }

        public Criteria andDelayTimeIsNull() {
            addCriterion("delay_time is null");
            return (Criteria) this;
        }

        public Criteria andDelayTimeIsNotNull() {
            addCriterion("delay_time is not null");
            return (Criteria) this;
        }

        public Criteria andDelayTimeEqualTo(Integer value) {
            addCriterion("delay_time =", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeNotEqualTo(Integer value) {
            addCriterion("delay_time <>", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeGreaterThan(Integer value) {
            addCriterion("delay_time >", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("delay_time >=", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeLessThan(Integer value) {
            addCriterion("delay_time <", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeLessThanOrEqualTo(Integer value) {
            addCriterion("delay_time <=", value, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeIn(List<Integer> values) {
            addCriterion("delay_time in", values, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeNotIn(List<Integer> values) {
            addCriterion("delay_time not in", values, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeBetween(Integer value1, Integer value2) {
            addCriterion("delay_time between", value1, value2, "delayTime");
            return (Criteria) this;
        }

        public Criteria andDelayTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("delay_time not between", value1, value2, "delayTime");
            return (Criteria) this;
        }

        public Criteria andLimitNumberIsNull() {
            addCriterion("limit_number is null");
            return (Criteria) this;
        }

        public Criteria andLimitNumberIsNotNull() {
            addCriterion("limit_number is not null");
            return (Criteria) this;
        }

        public Criteria andLimitNumberEqualTo(Byte value) {
            addCriterion("limit_number =", value, "limitNumber");
            return (Criteria) this;
        }

        public Criteria andLimitNumberNotEqualTo(Byte value) {
            addCriterion("limit_number <>", value, "limitNumber");
            return (Criteria) this;
        }

        public Criteria andLimitNumberGreaterThan(Byte value) {
            addCriterion("limit_number >", value, "limitNumber");
            return (Criteria) this;
        }

        public Criteria andLimitNumberGreaterThanOrEqualTo(Byte value) {
            addCriterion("limit_number >=", value, "limitNumber");
            return (Criteria) this;
        }

        public Criteria andLimitNumberLessThan(Byte value) {
            addCriterion("limit_number <", value, "limitNumber");
            return (Criteria) this;
        }

        public Criteria andLimitNumberLessThanOrEqualTo(Byte value) {
            addCriterion("limit_number <=", value, "limitNumber");
            return (Criteria) this;
        }

        public Criteria andLimitNumberIn(List<Byte> values) {
            addCriterion("limit_number in", values, "limitNumber");
            return (Criteria) this;
        }

        public Criteria andLimitNumberNotIn(List<Byte> values) {
            addCriterion("limit_number not in", values, "limitNumber");
            return (Criteria) this;
        }

        public Criteria andLimitNumberBetween(Byte value1, Byte value2) {
            addCriterion("limit_number between", value1, value2, "limitNumber");
            return (Criteria) this;
        }

        public Criteria andLimitNumberNotBetween(Byte value1, Byte value2) {
            addCriterion("limit_number not between", value1, value2, "limitNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andKeyIsNull() {
            addCriterion("key is null");
            return (Criteria) this;
        }

        public Criteria andKeyIsNotNull() {
            addCriterion("key is not null");
            return (Criteria) this;
        }

        public Criteria andKeyEqualTo(String value) {
            addCriterion("key =", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotEqualTo(String value) {
            addCriterion("key <>", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThan(String value) {
            addCriterion("key >", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThanOrEqualTo(String value) {
            addCriterion("key >=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThan(String value) {
            addCriterion("key <", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThanOrEqualTo(String value) {
            addCriterion("key <=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLike(String value) {
            addCriterion("key like", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotLike(String value) {
            addCriterion("key not like", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyIn(List<String> values) {
            addCriterion("key in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotIn(List<String> values) {
            addCriterion("key not in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyBetween(String value1, String value2) {
            addCriterion("key between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotBetween(String value1, String value2) {
            addCriterion("key not between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNewIsNull() {
            addCriterion("key_new is null");
            return (Criteria) this;
        }

        public Criteria andKeyNewIsNotNull() {
            addCriterion("key_new is not null");
            return (Criteria) this;
        }

        public Criteria andKeyNewEqualTo(String value) {
            addCriterion("key_new =", value, "keyNew");
            return (Criteria) this;
        }

        public Criteria andKeyNewNotEqualTo(String value) {
            addCriterion("key_new <>", value, "keyNew");
            return (Criteria) this;
        }

        public Criteria andKeyNewGreaterThan(String value) {
            addCriterion("key_new >", value, "keyNew");
            return (Criteria) this;
        }

        public Criteria andKeyNewGreaterThanOrEqualTo(String value) {
            addCriterion("key_new >=", value, "keyNew");
            return (Criteria) this;
        }

        public Criteria andKeyNewLessThan(String value) {
            addCriterion("key_new <", value, "keyNew");
            return (Criteria) this;
        }

        public Criteria andKeyNewLessThanOrEqualTo(String value) {
            addCriterion("key_new <=", value, "keyNew");
            return (Criteria) this;
        }

        public Criteria andKeyNewLike(String value) {
            addCriterion("key_new like", value, "keyNew");
            return (Criteria) this;
        }

        public Criteria andKeyNewNotLike(String value) {
            addCriterion("key_new not like", value, "keyNew");
            return (Criteria) this;
        }

        public Criteria andKeyNewIn(List<String> values) {
            addCriterion("key_new in", values, "keyNew");
            return (Criteria) this;
        }

        public Criteria andKeyNewNotIn(List<String> values) {
            addCriterion("key_new not in", values, "keyNew");
            return (Criteria) this;
        }

        public Criteria andKeyNewBetween(String value1, String value2) {
            addCriterion("key_new between", value1, value2, "keyNew");
            return (Criteria) this;
        }

        public Criteria andKeyNewNotBetween(String value1, String value2) {
            addCriterion("key_new not between", value1, value2, "keyNew");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andKeyNewTimeIsNull() {
            addCriterion("key_new_time is null");
            return (Criteria) this;
        }

        public Criteria andKeyNewTimeIsNotNull() {
            addCriterion("key_new_time is not null");
            return (Criteria) this;
        }

        public Criteria andKeyNewTimeEqualTo(Date value) {
            addCriterion("key_new_time =", value, "keyNewTime");
            return (Criteria) this;
        }

        public Criteria andKeyNewTimeNotEqualTo(Date value) {
            addCriterion("key_new_time <>", value, "keyNewTime");
            return (Criteria) this;
        }

        public Criteria andKeyNewTimeGreaterThan(Date value) {
            addCriterion("key_new_time >", value, "keyNewTime");
            return (Criteria) this;
        }

        public Criteria andKeyNewTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("key_new_time >=", value, "keyNewTime");
            return (Criteria) this;
        }

        public Criteria andKeyNewTimeLessThan(Date value) {
            addCriterion("key_new_time <", value, "keyNewTime");
            return (Criteria) this;
        }

        public Criteria andKeyNewTimeLessThanOrEqualTo(Date value) {
            addCriterion("key_new_time <=", value, "keyNewTime");
            return (Criteria) this;
        }

        public Criteria andKeyNewTimeIn(List<Date> values) {
            addCriterion("key_new_time in", values, "keyNewTime");
            return (Criteria) this;
        }

        public Criteria andKeyNewTimeNotIn(List<Date> values) {
            addCriterion("key_new_time not in", values, "keyNewTime");
            return (Criteria) this;
        }

        public Criteria andKeyNewTimeBetween(Date value1, Date value2) {
            addCriterion("key_new_time between", value1, value2, "keyNewTime");
            return (Criteria) this;
        }

        public Criteria andKeyNewTimeNotBetween(Date value1, Date value2) {
            addCriterion("key_new_time not between", value1, value2, "keyNewTime");
            return (Criteria) this;
        }

        public Criteria andKeyActiveTimeIsNull() {
            addCriterion("key_active_time is null");
            return (Criteria) this;
        }

        public Criteria andKeyActiveTimeIsNotNull() {
            addCriterion("key_active_time is not null");
            return (Criteria) this;
        }

        public Criteria andKeyActiveTimeEqualTo(Date value) {
            addCriterion("key_active_time =", value, "keyActiveTime");
            return (Criteria) this;
        }

        public Criteria andKeyActiveTimeNotEqualTo(Date value) {
            addCriterion("key_active_time <>", value, "keyActiveTime");
            return (Criteria) this;
        }

        public Criteria andKeyActiveTimeGreaterThan(Date value) {
            addCriterion("key_active_time >", value, "keyActiveTime");
            return (Criteria) this;
        }

        public Criteria andKeyActiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("key_active_time >=", value, "keyActiveTime");
            return (Criteria) this;
        }

        public Criteria andKeyActiveTimeLessThan(Date value) {
            addCriterion("key_active_time <", value, "keyActiveTime");
            return (Criteria) this;
        }

        public Criteria andKeyActiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("key_active_time <=", value, "keyActiveTime");
            return (Criteria) this;
        }

        public Criteria andKeyActiveTimeIn(List<Date> values) {
            addCriterion("key_active_time in", values, "keyActiveTime");
            return (Criteria) this;
        }

        public Criteria andKeyActiveTimeNotIn(List<Date> values) {
            addCriterion("key_active_time not in", values, "keyActiveTime");
            return (Criteria) this;
        }

        public Criteria andKeyActiveTimeBetween(Date value1, Date value2) {
            addCriterion("key_active_time between", value1, value2, "keyActiveTime");
            return (Criteria) this;
        }

        public Criteria andKeyActiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("key_active_time not between", value1, value2, "keyActiveTime");
            return (Criteria) this;
        }

        public Criteria andUseStatusIsNull() {
            addCriterion("use_status is null");
            return (Criteria) this;
        }

        public Criteria andUseStatusIsNotNull() {
            addCriterion("use_status is not null");
            return (Criteria) this;
        }

        public Criteria andUseStatusEqualTo(Boolean value) {
            addCriterion("use_status =", value, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusNotEqualTo(Boolean value) {
            addCriterion("use_status <>", value, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusGreaterThan(Boolean value) {
            addCriterion("use_status >", value, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("use_status >=", value, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusLessThan(Boolean value) {
            addCriterion("use_status <", value, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("use_status <=", value, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusIn(List<Boolean> values) {
            addCriterion("use_status in", values, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusNotIn(List<Boolean> values) {
            addCriterion("use_status not in", values, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("use_status between", value1, value2, "useStatus");
            return (Criteria) this;
        }

        public Criteria andUseStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("use_status not between", value1, value2, "useStatus");
            return (Criteria) this;
        }

        public Criteria andProblemLogIsNull() {
            addCriterion("problem_log is null");
            return (Criteria) this;
        }

        public Criteria andProblemLogIsNotNull() {
            addCriterion("problem_log is not null");
            return (Criteria) this;
        }

        public Criteria andProblemLogEqualTo(String value) {
            addCriterion("problem_log =", value, "problemLog");
            return (Criteria) this;
        }

        public Criteria andProblemLogNotEqualTo(String value) {
            addCriterion("problem_log <>", value, "problemLog");
            return (Criteria) this;
        }

        public Criteria andProblemLogGreaterThan(String value) {
            addCriterion("problem_log >", value, "problemLog");
            return (Criteria) this;
        }

        public Criteria andProblemLogGreaterThanOrEqualTo(String value) {
            addCriterion("problem_log >=", value, "problemLog");
            return (Criteria) this;
        }

        public Criteria andProblemLogLessThan(String value) {
            addCriterion("problem_log <", value, "problemLog");
            return (Criteria) this;
        }

        public Criteria andProblemLogLessThanOrEqualTo(String value) {
            addCriterion("problem_log <=", value, "problemLog");
            return (Criteria) this;
        }

        public Criteria andProblemLogLike(String value) {
            addCriterion("problem_log like", value, "problemLog");
            return (Criteria) this;
        }

        public Criteria andProblemLogNotLike(String value) {
            addCriterion("problem_log not like", value, "problemLog");
            return (Criteria) this;
        }

        public Criteria andProblemLogIn(List<String> values) {
            addCriterion("problem_log in", values, "problemLog");
            return (Criteria) this;
        }

        public Criteria andProblemLogNotIn(List<String> values) {
            addCriterion("problem_log not in", values, "problemLog");
            return (Criteria) this;
        }

        public Criteria andProblemLogBetween(String value1, String value2) {
            addCriterion("problem_log between", value1, value2, "problemLog");
            return (Criteria) this;
        }

        public Criteria andProblemLogNotBetween(String value1, String value2) {
            addCriterion("problem_log not between", value1, value2, "problemLog");
            return (Criteria) this;
        }

        public Criteria andBusinessTripsIsNull() {
            addCriterion("business_trips is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTripsIsNotNull() {
            addCriterion("business_trips is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTripsEqualTo(String value) {
            addCriterion("business_trips =", value, "businessTrips");
            return (Criteria) this;
        }

        public Criteria andBusinessTripsNotEqualTo(String value) {
            addCriterion("business_trips <>", value, "businessTrips");
            return (Criteria) this;
        }

        public Criteria andBusinessTripsGreaterThan(String value) {
            addCriterion("business_trips >", value, "businessTrips");
            return (Criteria) this;
        }

        public Criteria andBusinessTripsGreaterThanOrEqualTo(String value) {
            addCriterion("business_trips >=", value, "businessTrips");
            return (Criteria) this;
        }

        public Criteria andBusinessTripsLessThan(String value) {
            addCriterion("business_trips <", value, "businessTrips");
            return (Criteria) this;
        }

        public Criteria andBusinessTripsLessThanOrEqualTo(String value) {
            addCriterion("business_trips <=", value, "businessTrips");
            return (Criteria) this;
        }

        public Criteria andBusinessTripsLike(String value) {
            addCriterion("business_trips like", value, "businessTrips");
            return (Criteria) this;
        }

        public Criteria andBusinessTripsNotLike(String value) {
            addCriterion("business_trips not like", value, "businessTrips");
            return (Criteria) this;
        }

        public Criteria andBusinessTripsIn(List<String> values) {
            addCriterion("business_trips in", values, "businessTrips");
            return (Criteria) this;
        }

        public Criteria andBusinessTripsNotIn(List<String> values) {
            addCriterion("business_trips not in", values, "businessTrips");
            return (Criteria) this;
        }

        public Criteria andBusinessTripsBetween(String value1, String value2) {
            addCriterion("business_trips between", value1, value2, "businessTrips");
            return (Criteria) this;
        }

        public Criteria andBusinessTripsNotBetween(String value1, String value2) {
            addCriterion("business_trips not between", value1, value2, "businessTrips");
            return (Criteria) this;
        }

        public Criteria andSchoolHeadIsNull() {
            addCriterion("school_head is null");
            return (Criteria) this;
        }

        public Criteria andSchoolHeadIsNotNull() {
            addCriterion("school_head is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolHeadEqualTo(String value) {
            addCriterion("school_head =", value, "schoolHead");
            return (Criteria) this;
        }

        public Criteria andSchoolHeadNotEqualTo(String value) {
            addCriterion("school_head <>", value, "schoolHead");
            return (Criteria) this;
        }

        public Criteria andSchoolHeadGreaterThan(String value) {
            addCriterion("school_head >", value, "schoolHead");
            return (Criteria) this;
        }

        public Criteria andSchoolHeadGreaterThanOrEqualTo(String value) {
            addCriterion("school_head >=", value, "schoolHead");
            return (Criteria) this;
        }

        public Criteria andSchoolHeadLessThan(String value) {
            addCriterion("school_head <", value, "schoolHead");
            return (Criteria) this;
        }

        public Criteria andSchoolHeadLessThanOrEqualTo(String value) {
            addCriterion("school_head <=", value, "schoolHead");
            return (Criteria) this;
        }

        public Criteria andSchoolHeadLike(String value) {
            addCriterion("school_head like", value, "schoolHead");
            return (Criteria) this;
        }

        public Criteria andSchoolHeadNotLike(String value) {
            addCriterion("school_head not like", value, "schoolHead");
            return (Criteria) this;
        }

        public Criteria andSchoolHeadIn(List<String> values) {
            addCriterion("school_head in", values, "schoolHead");
            return (Criteria) this;
        }

        public Criteria andSchoolHeadNotIn(List<String> values) {
            addCriterion("school_head not in", values, "schoolHead");
            return (Criteria) this;
        }

        public Criteria andSchoolHeadBetween(String value1, String value2) {
            addCriterion("school_head between", value1, value2, "schoolHead");
            return (Criteria) this;
        }

        public Criteria andSchoolHeadNotBetween(String value1, String value2) {
            addCriterion("school_head not between", value1, value2, "schoolHead");
            return (Criteria) this;
        }

        public Criteria andSchoolReplacementIsNull() {
            addCriterion("school_replacement is null");
            return (Criteria) this;
        }

        public Criteria andSchoolReplacementIsNotNull() {
            addCriterion("school_replacement is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolReplacementEqualTo(String value) {
            addCriterion("school_replacement =", value, "schoolReplacement");
            return (Criteria) this;
        }

        public Criteria andSchoolReplacementNotEqualTo(String value) {
            addCriterion("school_replacement <>", value, "schoolReplacement");
            return (Criteria) this;
        }

        public Criteria andSchoolReplacementGreaterThan(String value) {
            addCriterion("school_replacement >", value, "schoolReplacement");
            return (Criteria) this;
        }

        public Criteria andSchoolReplacementGreaterThanOrEqualTo(String value) {
            addCriterion("school_replacement >=", value, "schoolReplacement");
            return (Criteria) this;
        }

        public Criteria andSchoolReplacementLessThan(String value) {
            addCriterion("school_replacement <", value, "schoolReplacement");
            return (Criteria) this;
        }

        public Criteria andSchoolReplacementLessThanOrEqualTo(String value) {
            addCriterion("school_replacement <=", value, "schoolReplacement");
            return (Criteria) this;
        }

        public Criteria andSchoolReplacementLike(String value) {
            addCriterion("school_replacement like", value, "schoolReplacement");
            return (Criteria) this;
        }

        public Criteria andSchoolReplacementNotLike(String value) {
            addCriterion("school_replacement not like", value, "schoolReplacement");
            return (Criteria) this;
        }

        public Criteria andSchoolReplacementIn(List<String> values) {
            addCriterion("school_replacement in", values, "schoolReplacement");
            return (Criteria) this;
        }

        public Criteria andSchoolReplacementNotIn(List<String> values) {
            addCriterion("school_replacement not in", values, "schoolReplacement");
            return (Criteria) this;
        }

        public Criteria andSchoolReplacementBetween(String value1, String value2) {
            addCriterion("school_replacement between", value1, value2, "schoolReplacement");
            return (Criteria) this;
        }

        public Criteria andSchoolReplacementNotBetween(String value1, String value2) {
            addCriterion("school_replacement not between", value1, value2, "schoolReplacement");
            return (Criteria) this;
        }

        public Criteria andRouterIsNull() {
            addCriterion("router is null");
            return (Criteria) this;
        }

        public Criteria andRouterIsNotNull() {
            addCriterion("router is not null");
            return (Criteria) this;
        }

        public Criteria andRouterEqualTo(String value) {
            addCriterion("router =", value, "router");
            return (Criteria) this;
        }

        public Criteria andRouterNotEqualTo(String value) {
            addCriterion("router <>", value, "router");
            return (Criteria) this;
        }

        public Criteria andRouterGreaterThan(String value) {
            addCriterion("router >", value, "router");
            return (Criteria) this;
        }

        public Criteria andRouterGreaterThanOrEqualTo(String value) {
            addCriterion("router >=", value, "router");
            return (Criteria) this;
        }

        public Criteria andRouterLessThan(String value) {
            addCriterion("router <", value, "router");
            return (Criteria) this;
        }

        public Criteria andRouterLessThanOrEqualTo(String value) {
            addCriterion("router <=", value, "router");
            return (Criteria) this;
        }

        public Criteria andRouterLike(String value) {
            addCriterion("router like", value, "router");
            return (Criteria) this;
        }

        public Criteria andRouterNotLike(String value) {
            addCriterion("router not like", value, "router");
            return (Criteria) this;
        }

        public Criteria andRouterIn(List<String> values) {
            addCriterion("router in", values, "router");
            return (Criteria) this;
        }

        public Criteria andRouterNotIn(List<String> values) {
            addCriterion("router not in", values, "router");
            return (Criteria) this;
        }

        public Criteria andRouterBetween(String value1, String value2) {
            addCriterion("router between", value1, value2, "router");
            return (Criteria) this;
        }

        public Criteria andRouterNotBetween(String value1, String value2) {
            addCriterion("router not between", value1, value2, "router");
            return (Criteria) this;
        }

        public Criteria andWifiIsNull() {
            addCriterion("wifi is null");
            return (Criteria) this;
        }

        public Criteria andWifiIsNotNull() {
            addCriterion("wifi is not null");
            return (Criteria) this;
        }

        public Criteria andWifiEqualTo(String value) {
            addCriterion("wifi =", value, "wifi");
            return (Criteria) this;
        }

        public Criteria andWifiNotEqualTo(String value) {
            addCriterion("wifi <>", value, "wifi");
            return (Criteria) this;
        }

        public Criteria andWifiGreaterThan(String value) {
            addCriterion("wifi >", value, "wifi");
            return (Criteria) this;
        }

        public Criteria andWifiGreaterThanOrEqualTo(String value) {
            addCriterion("wifi >=", value, "wifi");
            return (Criteria) this;
        }

        public Criteria andWifiLessThan(String value) {
            addCriterion("wifi <", value, "wifi");
            return (Criteria) this;
        }

        public Criteria andWifiLessThanOrEqualTo(String value) {
            addCriterion("wifi <=", value, "wifi");
            return (Criteria) this;
        }

        public Criteria andWifiLike(String value) {
            addCriterion("wifi like", value, "wifi");
            return (Criteria) this;
        }

        public Criteria andWifiNotLike(String value) {
            addCriterion("wifi not like", value, "wifi");
            return (Criteria) this;
        }

        public Criteria andWifiIn(List<String> values) {
            addCriterion("wifi in", values, "wifi");
            return (Criteria) this;
        }

        public Criteria andWifiNotIn(List<String> values) {
            addCriterion("wifi not in", values, "wifi");
            return (Criteria) this;
        }

        public Criteria andWifiBetween(String value1, String value2) {
            addCriterion("wifi between", value1, value2, "wifi");
            return (Criteria) this;
        }

        public Criteria andWifiNotBetween(String value1, String value2) {
            addCriterion("wifi not between", value1, value2, "wifi");
            return (Criteria) this;
        }

        public Criteria andGategodTypeIsNull() {
            addCriterion("gategod_type is null");
            return (Criteria) this;
        }

        public Criteria andGategodTypeIsNotNull() {
            addCriterion("gategod_type is not null");
            return (Criteria) this;
        }

        public Criteria andGategodTypeEqualTo(Boolean value) {
            addCriterion("gategod_type =", value, "gategodType");
            return (Criteria) this;
        }

        public Criteria andGategodTypeNotEqualTo(Boolean value) {
            addCriterion("gategod_type <>", value, "gategodType");
            return (Criteria) this;
        }

        public Criteria andGategodTypeGreaterThan(Boolean value) {
            addCriterion("gategod_type >", value, "gategodType");
            return (Criteria) this;
        }

        public Criteria andGategodTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("gategod_type >=", value, "gategodType");
            return (Criteria) this;
        }

        public Criteria andGategodTypeLessThan(Boolean value) {
            addCriterion("gategod_type <", value, "gategodType");
            return (Criteria) this;
        }

        public Criteria andGategodTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("gategod_type <=", value, "gategodType");
            return (Criteria) this;
        }

        public Criteria andGategodTypeIn(List<Boolean> values) {
            addCriterion("gategod_type in", values, "gategodType");
            return (Criteria) this;
        }

        public Criteria andGategodTypeNotIn(List<Boolean> values) {
            addCriterion("gategod_type not in", values, "gategodType");
            return (Criteria) this;
        }

        public Criteria andGategodTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("gategod_type between", value1, value2, "gategodType");
            return (Criteria) this;
        }

        public Criteria andGategodTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("gategod_type not between", value1, value2, "gategodType");
            return (Criteria) this;
        }

        public Criteria andGategodDeviceNumberIsNull() {
            addCriterion("gategod_device_number is null");
            return (Criteria) this;
        }

        public Criteria andGategodDeviceNumberIsNotNull() {
            addCriterion("gategod_device_number is not null");
            return (Criteria) this;
        }

        public Criteria andGategodDeviceNumberEqualTo(String value) {
            addCriterion("gategod_device_number =", value, "gategodDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andGategodDeviceNumberNotEqualTo(String value) {
            addCriterion("gategod_device_number <>", value, "gategodDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andGategodDeviceNumberGreaterThan(String value) {
            addCriterion("gategod_device_number >", value, "gategodDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andGategodDeviceNumberGreaterThanOrEqualTo(String value) {
            addCriterion("gategod_device_number >=", value, "gategodDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andGategodDeviceNumberLessThan(String value) {
            addCriterion("gategod_device_number <", value, "gategodDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andGategodDeviceNumberLessThanOrEqualTo(String value) {
            addCriterion("gategod_device_number <=", value, "gategodDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andGategodDeviceNumberLike(String value) {
            addCriterion("gategod_device_number like", value, "gategodDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andGategodDeviceNumberNotLike(String value) {
            addCriterion("gategod_device_number not like", value, "gategodDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andGategodDeviceNumberIn(List<String> values) {
            addCriterion("gategod_device_number in", values, "gategodDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andGategodDeviceNumberNotIn(List<String> values) {
            addCriterion("gategod_device_number not in", values, "gategodDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andGategodDeviceNumberBetween(String value1, String value2) {
            addCriterion("gategod_device_number between", value1, value2, "gategodDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andGategodDeviceNumberNotBetween(String value1, String value2) {
            addCriterion("gategod_device_number not between", value1, value2, "gategodDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andGategodVersionIsNull() {
            addCriterion("gategod_version is null");
            return (Criteria) this;
        }

        public Criteria andGategodVersionIsNotNull() {
            addCriterion("gategod_version is not null");
            return (Criteria) this;
        }

        public Criteria andGategodVersionEqualTo(String value) {
            addCriterion("gategod_version =", value, "gategodVersion");
            return (Criteria) this;
        }

        public Criteria andGategodVersionNotEqualTo(String value) {
            addCriterion("gategod_version <>", value, "gategodVersion");
            return (Criteria) this;
        }

        public Criteria andGategodVersionGreaterThan(String value) {
            addCriterion("gategod_version >", value, "gategodVersion");
            return (Criteria) this;
        }

        public Criteria andGategodVersionGreaterThanOrEqualTo(String value) {
            addCriterion("gategod_version >=", value, "gategodVersion");
            return (Criteria) this;
        }

        public Criteria andGategodVersionLessThan(String value) {
            addCriterion("gategod_version <", value, "gategodVersion");
            return (Criteria) this;
        }

        public Criteria andGategodVersionLessThanOrEqualTo(String value) {
            addCriterion("gategod_version <=", value, "gategodVersion");
            return (Criteria) this;
        }

        public Criteria andGategodVersionLike(String value) {
            addCriterion("gategod_version like", value, "gategodVersion");
            return (Criteria) this;
        }

        public Criteria andGategodVersionNotLike(String value) {
            addCriterion("gategod_version not like", value, "gategodVersion");
            return (Criteria) this;
        }

        public Criteria andGategodVersionIn(List<String> values) {
            addCriterion("gategod_version in", values, "gategodVersion");
            return (Criteria) this;
        }

        public Criteria andGategodVersionNotIn(List<String> values) {
            addCriterion("gategod_version not in", values, "gategodVersion");
            return (Criteria) this;
        }

        public Criteria andGategodVersionBetween(String value1, String value2) {
            addCriterion("gategod_version between", value1, value2, "gategodVersion");
            return (Criteria) this;
        }

        public Criteria andGategodVersionNotBetween(String value1, String value2) {
            addCriterion("gategod_version not between", value1, value2, "gategodVersion");
            return (Criteria) this;
        }

        public Criteria andGategodCameraIsNull() {
            addCriterion("gategod_camera is null");
            return (Criteria) this;
        }

        public Criteria andGategodCameraIsNotNull() {
            addCriterion("gategod_camera is not null");
            return (Criteria) this;
        }

        public Criteria andGategodCameraEqualTo(Boolean value) {
            addCriterion("gategod_camera =", value, "gategodCamera");
            return (Criteria) this;
        }

        public Criteria andGategodCameraNotEqualTo(Boolean value) {
            addCriterion("gategod_camera <>", value, "gategodCamera");
            return (Criteria) this;
        }

        public Criteria andGategodCameraGreaterThan(Boolean value) {
            addCriterion("gategod_camera >", value, "gategodCamera");
            return (Criteria) this;
        }

        public Criteria andGategodCameraGreaterThanOrEqualTo(Boolean value) {
            addCriterion("gategod_camera >=", value, "gategodCamera");
            return (Criteria) this;
        }

        public Criteria andGategodCameraLessThan(Boolean value) {
            addCriterion("gategod_camera <", value, "gategodCamera");
            return (Criteria) this;
        }

        public Criteria andGategodCameraLessThanOrEqualTo(Boolean value) {
            addCriterion("gategod_camera <=", value, "gategodCamera");
            return (Criteria) this;
        }

        public Criteria andGategodCameraIn(List<Boolean> values) {
            addCriterion("gategod_camera in", values, "gategodCamera");
            return (Criteria) this;
        }

        public Criteria andGategodCameraNotIn(List<Boolean> values) {
            addCriterion("gategod_camera not in", values, "gategodCamera");
            return (Criteria) this;
        }

        public Criteria andGategodCameraBetween(Boolean value1, Boolean value2) {
            addCriterion("gategod_camera between", value1, value2, "gategodCamera");
            return (Criteria) this;
        }

        public Criteria andGategodCameraNotBetween(Boolean value1, Boolean value2) {
            addCriterion("gategod_camera not between", value1, value2, "gategodCamera");
            return (Criteria) this;
        }

        public Criteria andGategodAttentionIsNull() {
            addCriterion("gategod_attention is null");
            return (Criteria) this;
        }

        public Criteria andGategodAttentionIsNotNull() {
            addCriterion("gategod_attention is not null");
            return (Criteria) this;
        }

        public Criteria andGategodAttentionEqualTo(String value) {
            addCriterion("gategod_attention =", value, "gategodAttention");
            return (Criteria) this;
        }

        public Criteria andGategodAttentionNotEqualTo(String value) {
            addCriterion("gategod_attention <>", value, "gategodAttention");
            return (Criteria) this;
        }

        public Criteria andGategodAttentionGreaterThan(String value) {
            addCriterion("gategod_attention >", value, "gategodAttention");
            return (Criteria) this;
        }

        public Criteria andGategodAttentionGreaterThanOrEqualTo(String value) {
            addCriterion("gategod_attention >=", value, "gategodAttention");
            return (Criteria) this;
        }

        public Criteria andGategodAttentionLessThan(String value) {
            addCriterion("gategod_attention <", value, "gategodAttention");
            return (Criteria) this;
        }

        public Criteria andGategodAttentionLessThanOrEqualTo(String value) {
            addCriterion("gategod_attention <=", value, "gategodAttention");
            return (Criteria) this;
        }

        public Criteria andGategodAttentionLike(String value) {
            addCriterion("gategod_attention like", value, "gategodAttention");
            return (Criteria) this;
        }

        public Criteria andGategodAttentionNotLike(String value) {
            addCriterion("gategod_attention not like", value, "gategodAttention");
            return (Criteria) this;
        }

        public Criteria andGategodAttentionIn(List<String> values) {
            addCriterion("gategod_attention in", values, "gategodAttention");
            return (Criteria) this;
        }

        public Criteria andGategodAttentionNotIn(List<String> values) {
            addCriterion("gategod_attention not in", values, "gategodAttention");
            return (Criteria) this;
        }

        public Criteria andGategodAttentionBetween(String value1, String value2) {
            addCriterion("gategod_attention between", value1, value2, "gategodAttention");
            return (Criteria) this;
        }

        public Criteria andGategodAttentionNotBetween(String value1, String value2) {
            addCriterion("gategod_attention not between", value1, value2, "gategodAttention");
            return (Criteria) this;
        }

        public Criteria andRobotDeviceNumberIsNull() {
            addCriterion("robot_device_number is null");
            return (Criteria) this;
        }

        public Criteria andRobotDeviceNumberIsNotNull() {
            addCriterion("robot_device_number is not null");
            return (Criteria) this;
        }

        public Criteria andRobotDeviceNumberEqualTo(String value) {
            addCriterion("robot_device_number =", value, "robotDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andRobotDeviceNumberNotEqualTo(String value) {
            addCriterion("robot_device_number <>", value, "robotDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andRobotDeviceNumberGreaterThan(String value) {
            addCriterion("robot_device_number >", value, "robotDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andRobotDeviceNumberGreaterThanOrEqualTo(String value) {
            addCriterion("robot_device_number >=", value, "robotDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andRobotDeviceNumberLessThan(String value) {
            addCriterion("robot_device_number <", value, "robotDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andRobotDeviceNumberLessThanOrEqualTo(String value) {
            addCriterion("robot_device_number <=", value, "robotDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andRobotDeviceNumberLike(String value) {
            addCriterion("robot_device_number like", value, "robotDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andRobotDeviceNumberNotLike(String value) {
            addCriterion("robot_device_number not like", value, "robotDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andRobotDeviceNumberIn(List<String> values) {
            addCriterion("robot_device_number in", values, "robotDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andRobotDeviceNumberNotIn(List<String> values) {
            addCriterion("robot_device_number not in", values, "robotDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andRobotDeviceNumberBetween(String value1, String value2) {
            addCriterion("robot_device_number between", value1, value2, "robotDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andRobotDeviceNumberNotBetween(String value1, String value2) {
            addCriterion("robot_device_number not between", value1, value2, "robotDeviceNumber");
            return (Criteria) this;
        }

        public Criteria andRobotVersionIsNull() {
            addCriterion("robot_version is null");
            return (Criteria) this;
        }

        public Criteria andRobotVersionIsNotNull() {
            addCriterion("robot_version is not null");
            return (Criteria) this;
        }

        public Criteria andRobotVersionEqualTo(String value) {
            addCriterion("robot_version =", value, "robotVersion");
            return (Criteria) this;
        }

        public Criteria andRobotVersionNotEqualTo(String value) {
            addCriterion("robot_version <>", value, "robotVersion");
            return (Criteria) this;
        }

        public Criteria andRobotVersionGreaterThan(String value) {
            addCriterion("robot_version >", value, "robotVersion");
            return (Criteria) this;
        }

        public Criteria andRobotVersionGreaterThanOrEqualTo(String value) {
            addCriterion("robot_version >=", value, "robotVersion");
            return (Criteria) this;
        }

        public Criteria andRobotVersionLessThan(String value) {
            addCriterion("robot_version <", value, "robotVersion");
            return (Criteria) this;
        }

        public Criteria andRobotVersionLessThanOrEqualTo(String value) {
            addCriterion("robot_version <=", value, "robotVersion");
            return (Criteria) this;
        }

        public Criteria andRobotVersionLike(String value) {
            addCriterion("robot_version like", value, "robotVersion");
            return (Criteria) this;
        }

        public Criteria andRobotVersionNotLike(String value) {
            addCriterion("robot_version not like", value, "robotVersion");
            return (Criteria) this;
        }

        public Criteria andRobotVersionIn(List<String> values) {
            addCriterion("robot_version in", values, "robotVersion");
            return (Criteria) this;
        }

        public Criteria andRobotVersionNotIn(List<String> values) {
            addCriterion("robot_version not in", values, "robotVersion");
            return (Criteria) this;
        }

        public Criteria andRobotVersionBetween(String value1, String value2) {
            addCriterion("robot_version between", value1, value2, "robotVersion");
            return (Criteria) this;
        }

        public Criteria andRobotVersionNotBetween(String value1, String value2) {
            addCriterion("robot_version not between", value1, value2, "robotVersion");
            return (Criteria) this;
        }

        public Criteria andRobotAttentionIsNull() {
            addCriterion("robot_attention is null");
            return (Criteria) this;
        }

        public Criteria andRobotAttentionIsNotNull() {
            addCriterion("robot_attention is not null");
            return (Criteria) this;
        }

        public Criteria andRobotAttentionEqualTo(String value) {
            addCriterion("robot_attention =", value, "robotAttention");
            return (Criteria) this;
        }

        public Criteria andRobotAttentionNotEqualTo(String value) {
            addCriterion("robot_attention <>", value, "robotAttention");
            return (Criteria) this;
        }

        public Criteria andRobotAttentionGreaterThan(String value) {
            addCriterion("robot_attention >", value, "robotAttention");
            return (Criteria) this;
        }

        public Criteria andRobotAttentionGreaterThanOrEqualTo(String value) {
            addCriterion("robot_attention >=", value, "robotAttention");
            return (Criteria) this;
        }

        public Criteria andRobotAttentionLessThan(String value) {
            addCriterion("robot_attention <", value, "robotAttention");
            return (Criteria) this;
        }

        public Criteria andRobotAttentionLessThanOrEqualTo(String value) {
            addCriterion("robot_attention <=", value, "robotAttention");
            return (Criteria) this;
        }

        public Criteria andRobotAttentionLike(String value) {
            addCriterion("robot_attention like", value, "robotAttention");
            return (Criteria) this;
        }

        public Criteria andRobotAttentionNotLike(String value) {
            addCriterion("robot_attention not like", value, "robotAttention");
            return (Criteria) this;
        }

        public Criteria andRobotAttentionIn(List<String> values) {
            addCriterion("robot_attention in", values, "robotAttention");
            return (Criteria) this;
        }

        public Criteria andRobotAttentionNotIn(List<String> values) {
            addCriterion("robot_attention not in", values, "robotAttention");
            return (Criteria) this;
        }

        public Criteria andRobotAttentionBetween(String value1, String value2) {
            addCriterion("robot_attention between", value1, value2, "robotAttention");
            return (Criteria) this;
        }

        public Criteria andRobotAttentionNotBetween(String value1, String value2) {
            addCriterion("robot_attention not between", value1, value2, "robotAttention");
            return (Criteria) this;
        }

        public Criteria andVideoCameraFactoryIsNull() {
            addCriterion("video_camera_factory is null");
            return (Criteria) this;
        }

        public Criteria andVideoCameraFactoryIsNotNull() {
            addCriterion("video_camera_factory is not null");
            return (Criteria) this;
        }

        public Criteria andVideoCameraFactoryEqualTo(String value) {
            addCriterion("video_camera_factory =", value, "videoCameraFactory");
            return (Criteria) this;
        }

        public Criteria andVideoCameraFactoryNotEqualTo(String value) {
            addCriterion("video_camera_factory <>", value, "videoCameraFactory");
            return (Criteria) this;
        }

        public Criteria andVideoCameraFactoryGreaterThan(String value) {
            addCriterion("video_camera_factory >", value, "videoCameraFactory");
            return (Criteria) this;
        }

        public Criteria andVideoCameraFactoryGreaterThanOrEqualTo(String value) {
            addCriterion("video_camera_factory >=", value, "videoCameraFactory");
            return (Criteria) this;
        }

        public Criteria andVideoCameraFactoryLessThan(String value) {
            addCriterion("video_camera_factory <", value, "videoCameraFactory");
            return (Criteria) this;
        }

        public Criteria andVideoCameraFactoryLessThanOrEqualTo(String value) {
            addCriterion("video_camera_factory <=", value, "videoCameraFactory");
            return (Criteria) this;
        }

        public Criteria andVideoCameraFactoryLike(String value) {
            addCriterion("video_camera_factory like", value, "videoCameraFactory");
            return (Criteria) this;
        }

        public Criteria andVideoCameraFactoryNotLike(String value) {
            addCriterion("video_camera_factory not like", value, "videoCameraFactory");
            return (Criteria) this;
        }

        public Criteria andVideoCameraFactoryIn(List<String> values) {
            addCriterion("video_camera_factory in", values, "videoCameraFactory");
            return (Criteria) this;
        }

        public Criteria andVideoCameraFactoryNotIn(List<String> values) {
            addCriterion("video_camera_factory not in", values, "videoCameraFactory");
            return (Criteria) this;
        }

        public Criteria andVideoCameraFactoryBetween(String value1, String value2) {
            addCriterion("video_camera_factory between", value1, value2, "videoCameraFactory");
            return (Criteria) this;
        }

        public Criteria andVideoCameraFactoryNotBetween(String value1, String value2) {
            addCriterion("video_camera_factory not between", value1, value2, "videoCameraFactory");
            return (Criteria) this;
        }

        public Criteria andVideoQuantityIsNull() {
            addCriterion("video_quantity is null");
            return (Criteria) this;
        }

        public Criteria andVideoQuantityIsNotNull() {
            addCriterion("video_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andVideoQuantityEqualTo(Integer value) {
            addCriterion("video_quantity =", value, "videoQuantity");
            return (Criteria) this;
        }

        public Criteria andVideoQuantityNotEqualTo(Integer value) {
            addCriterion("video_quantity <>", value, "videoQuantity");
            return (Criteria) this;
        }

        public Criteria andVideoQuantityGreaterThan(Integer value) {
            addCriterion("video_quantity >", value, "videoQuantity");
            return (Criteria) this;
        }

        public Criteria andVideoQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_quantity >=", value, "videoQuantity");
            return (Criteria) this;
        }

        public Criteria andVideoQuantityLessThan(Integer value) {
            addCriterion("video_quantity <", value, "videoQuantity");
            return (Criteria) this;
        }

        public Criteria andVideoQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("video_quantity <=", value, "videoQuantity");
            return (Criteria) this;
        }

        public Criteria andVideoQuantityIn(List<Integer> values) {
            addCriterion("video_quantity in", values, "videoQuantity");
            return (Criteria) this;
        }

        public Criteria andVideoQuantityNotIn(List<Integer> values) {
            addCriterion("video_quantity not in", values, "videoQuantity");
            return (Criteria) this;
        }

        public Criteria andVideoQuantityBetween(Integer value1, Integer value2) {
            addCriterion("video_quantity between", value1, value2, "videoQuantity");
            return (Criteria) this;
        }

        public Criteria andVideoQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("video_quantity not between", value1, value2, "videoQuantity");
            return (Criteria) this;
        }

        public Criteria andHostIsNull() {
            addCriterion("host is null");
            return (Criteria) this;
        }

        public Criteria andHostIsNotNull() {
            addCriterion("host is not null");
            return (Criteria) this;
        }

        public Criteria andHostEqualTo(Integer value) {
            addCriterion("host =", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotEqualTo(Integer value) {
            addCriterion("host <>", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThan(Integer value) {
            addCriterion("host >", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThanOrEqualTo(Integer value) {
            addCriterion("host >=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThan(Integer value) {
            addCriterion("host <", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThanOrEqualTo(Integer value) {
            addCriterion("host <=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostIn(List<Integer> values) {
            addCriterion("host in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotIn(List<Integer> values) {
            addCriterion("host not in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostBetween(Integer value1, Integer value2) {
            addCriterion("host between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotBetween(Integer value1, Integer value2) {
            addCriterion("host not between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNull() {
            addCriterion("updated is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNotNull() {
            addCriterion("updated is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedEqualTo(Date value) {
            addCriterion("updated =", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotEqualTo(Date value) {
            addCriterion("updated <>", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThan(Date value) {
            addCriterion("updated >", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("updated >=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThan(Date value) {
            addCriterion("updated <", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("updated <=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedIn(List<Date> values) {
            addCriterion("updated in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotIn(List<Date> values) {
            addCriterion("updated not in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedBetween(Date value1, Date value2) {
            addCriterion("updated between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("updated not between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Boolean value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Boolean> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Boolean> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}