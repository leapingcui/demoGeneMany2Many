package com.cy.module.submodule.entity;

import java.util.ArrayList;
import java.util.List;

public class ChooseCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChooseCourseExample() {
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

        public Criteria andCcSidIsNull() {
            addCriterion("cc_sid is null");
            return (Criteria) this;
        }

        public Criteria andCcSidIsNotNull() {
            addCriterion("cc_sid is not null");
            return (Criteria) this;
        }

        public Criteria andCcSidEqualTo(Integer value) {
            addCriterion("cc_sid =", value, "ccSid");
            return (Criteria) this;
        }

        public Criteria andCcSidNotEqualTo(Integer value) {
            addCriterion("cc_sid <>", value, "ccSid");
            return (Criteria) this;
        }

        public Criteria andCcSidGreaterThan(Integer value) {
            addCriterion("cc_sid >", value, "ccSid");
            return (Criteria) this;
        }

        public Criteria andCcSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cc_sid >=", value, "ccSid");
            return (Criteria) this;
        }

        public Criteria andCcSidLessThan(Integer value) {
            addCriterion("cc_sid <", value, "ccSid");
            return (Criteria) this;
        }

        public Criteria andCcSidLessThanOrEqualTo(Integer value) {
            addCriterion("cc_sid <=", value, "ccSid");
            return (Criteria) this;
        }

        public Criteria andCcSidIn(List<Integer> values) {
            addCriterion("cc_sid in", values, "ccSid");
            return (Criteria) this;
        }

        public Criteria andCcSidNotIn(List<Integer> values) {
            addCriterion("cc_sid not in", values, "ccSid");
            return (Criteria) this;
        }

        public Criteria andCcSidBetween(Integer value1, Integer value2) {
            addCriterion("cc_sid between", value1, value2, "ccSid");
            return (Criteria) this;
        }

        public Criteria andCcSidNotBetween(Integer value1, Integer value2) {
            addCriterion("cc_sid not between", value1, value2, "ccSid");
            return (Criteria) this;
        }

        public Criteria andCcCidIsNull() {
            addCriterion("cc_cid is null");
            return (Criteria) this;
        }

        public Criteria andCcCidIsNotNull() {
            addCriterion("cc_cid is not null");
            return (Criteria) this;
        }

        public Criteria andCcCidEqualTo(String value) {
            addCriterion("cc_cid =", value, "ccCid");
            return (Criteria) this;
        }

        public Criteria andCcCidNotEqualTo(String value) {
            addCriterion("cc_cid <>", value, "ccCid");
            return (Criteria) this;
        }

        public Criteria andCcCidGreaterThan(String value) {
            addCriterion("cc_cid >", value, "ccCid");
            return (Criteria) this;
        }

        public Criteria andCcCidGreaterThanOrEqualTo(String value) {
            addCriterion("cc_cid >=", value, "ccCid");
            return (Criteria) this;
        }

        public Criteria andCcCidLessThan(String value) {
            addCriterion("cc_cid <", value, "ccCid");
            return (Criteria) this;
        }

        public Criteria andCcCidLessThanOrEqualTo(String value) {
            addCriterion("cc_cid <=", value, "ccCid");
            return (Criteria) this;
        }

        public Criteria andCcCidLike(String value) {
            addCriterion("cc_cid like", value, "ccCid");
            return (Criteria) this;
        }

        public Criteria andCcCidNotLike(String value) {
            addCriterion("cc_cid not like", value, "ccCid");
            return (Criteria) this;
        }

        public Criteria andCcCidIn(List<String> values) {
            addCriterion("cc_cid in", values, "ccCid");
            return (Criteria) this;
        }

        public Criteria andCcCidNotIn(List<String> values) {
            addCriterion("cc_cid not in", values, "ccCid");
            return (Criteria) this;
        }

        public Criteria andCcCidBetween(String value1, String value2) {
            addCriterion("cc_cid between", value1, value2, "ccCid");
            return (Criteria) this;
        }

        public Criteria andCcCidNotBetween(String value1, String value2) {
            addCriterion("cc_cid not between", value1, value2, "ccCid");
            return (Criteria) this;
        }

        public Criteria andCcGradeIsNull() {
            addCriterion("cc_grade is null");
            return (Criteria) this;
        }

        public Criteria andCcGradeIsNotNull() {
            addCriterion("cc_grade is not null");
            return (Criteria) this;
        }

        public Criteria andCcGradeEqualTo(Integer value) {
            addCriterion("cc_grade =", value, "ccGrade");
            return (Criteria) this;
        }

        public Criteria andCcGradeNotEqualTo(Integer value) {
            addCriterion("cc_grade <>", value, "ccGrade");
            return (Criteria) this;
        }

        public Criteria andCcGradeGreaterThan(Integer value) {
            addCriterion("cc_grade >", value, "ccGrade");
            return (Criteria) this;
        }

        public Criteria andCcGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cc_grade >=", value, "ccGrade");
            return (Criteria) this;
        }

        public Criteria andCcGradeLessThan(Integer value) {
            addCriterion("cc_grade <", value, "ccGrade");
            return (Criteria) this;
        }

        public Criteria andCcGradeLessThanOrEqualTo(Integer value) {
            addCriterion("cc_grade <=", value, "ccGrade");
            return (Criteria) this;
        }

        public Criteria andCcGradeIn(List<Integer> values) {
            addCriterion("cc_grade in", values, "ccGrade");
            return (Criteria) this;
        }

        public Criteria andCcGradeNotIn(List<Integer> values) {
            addCriterion("cc_grade not in", values, "ccGrade");
            return (Criteria) this;
        }

        public Criteria andCcGradeBetween(Integer value1, Integer value2) {
            addCriterion("cc_grade between", value1, value2, "ccGrade");
            return (Criteria) this;
        }

        public Criteria andCcGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("cc_grade not between", value1, value2, "ccGrade");
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