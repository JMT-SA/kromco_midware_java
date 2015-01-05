/*
 * Bin.java
 *
 * Created on January 25, 2007, 4:07 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package za.co.multitier.midware.sys.datasource;

import java.sql.Date;

/**
 * @author Administrator
 */
public class Bin {

    public Boolean is_detroyed = false;

    private String bin_id;

    private String exit_ref;

    private Integer id;

    private String error_description;

    private String production_run_code;

    private String line_code;

    private java.sql.Timestamp tipped_date_time;

    private java.sql.Timestamp error_date_time;

    private String authorisor_name;

    private Integer production_run_id;

    private Integer production_run_tipped_id;

    private Integer shift_id;

    private Integer delivery_id;

    private java.sql.Timestamp bin_receive_datetime;

    private int error_code;

    private Double weight;

    //vals needed for bintip criteria check
    private String farm_code;
    private String commodity_code;
    private String variety_code;
    private String class_code;
    private String treatment_code;

    private String pc_code;
    private String track_indicator_code;
    private String cold_store_code;
    private String season_code;

    private Boolean grower_commitment_required;

    private  String dp_tiplot;

    //pre-sort fields
    private String ripe_point_code;
    private String size_code;
    private String rmt_product_type_code;
    private String pc_code_num;
    private String orchard_code;



    //---------
    //ACCESSORS
    //---------
    public String getBin_id() {
        return bin_id;
    }

    public void setBin_id(String bin_id) {
        this.bin_id = bin_id;
    }


    public String getProduction_run_code() {
        return production_run_code;
    }

    public void setProduction_run_code(String production_run_code) {
        this.production_run_code = production_run_code;
    }

    public String getLine_code() {
        return line_code;
    }

    public void setLine_code(String line_code) {
        this.line_code = line_code;
    }

    public java.sql.Timestamp getTipped_date_time() {
        return tipped_date_time;
    }

    public void setTipped_date_time(java.sql.Timestamp tipped_date_time) {
        this.tipped_date_time = tipped_date_time;
    }

    public String getAuthorisor_name() {
        return authorisor_name;
    }

    public void setAuthorisor_name(String authorisor_name) {
        this.authorisor_name = authorisor_name;
    }

    public Integer getProduction_run_id() {
        return production_run_id;
    }

    public void setProduction_run_id(int production_run_id) {
        this.production_run_id = production_run_id;
    }

    public String getError_description() {
        return error_description;
    }

    public void setError_description(String error_description) {
        this.error_description = error_description;
    }

    public java.sql.Timestamp getError_date_time() {
        return error_date_time;
    }

    public void setError_date_time(java.sql.Timestamp error_date_time) {
        this.error_date_time = error_date_time;
    }


    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    private Double bin_weight;

    public Double getBin_weight() {
        return bin_weight;
    }

    public void setBin_weight(Double bin_weight) {
        this.bin_weight = bin_weight;
    }


    public java.sql.Timestamp getBin_receive_datetime() {
        return bin_receive_datetime;
    }

    public void setBin_receive_datetime(java.sql.Timestamp bin_receive_datetime) {
        this.bin_receive_datetime = bin_receive_datetime;
    }

    /**
     * @return the shift_id
     */
    public Integer getShift_id() {
        return shift_id;
    }

    /**
     * @param shift_id the shift_id to set
     */
    public void setShift_id(Integer shift_id) {
        this.shift_id = shift_id;
    }

    /**
     * @return the farm_code
     */
    public String getFarm_code() {
        return farm_code;
    }

    /**
     * @param farm_code the farm_code to set
     */
    public void setFarm_code(String farm_code) {
        this.farm_code = farm_code;
    }

    /**
     * @return the commodity_code
     */
    public String getCommodity_code() {
        return commodity_code;
    }

    /**
     * @param commodity_code the commodity_code to set
     */
    public void setCommodity_code(String commodity_code) {
        this.commodity_code = commodity_code;
    }

    /**
     * @return the variety_code
     */
    public String getVariety_code() {
        return variety_code;
    }

    /**
     * @param variety_code the variety_code to set
     */
    public void setVariety_code(String variety_code) {
        this.variety_code = variety_code;
    }

    /**
     * @return the class_code
     */
    public String getClass_code() {
        return class_code;
    }

    /**
     * @param class_code the class_code to set
     */
    public void setClass_code(String class_code) {
        this.class_code = class_code;
    }

    /**
     * @return the treatment_code
     */
    public String getTreatment_code() {
        return treatment_code;
    }

    /**
     * @param treatment_code the treatment_code to set
     */
    public void setTreatment_code(String treatment_code) {
        this.treatment_code = treatment_code;
    }

    /**
     * @return the pc_code
     */
    public String getPc_code() {
        return pc_code;
    }

    /**
     * @param pc_code the pc_code to set
     */
    public void setPc_code(String pc_code) {
        this.pc_code = pc_code;
    }

    /**
     * @return the track_indicator_code
     */
    public String getTrack_indicator_code() {
        return track_indicator_code;
    }

    /**
     * @param track_indicator_code the track_indicator_code to set
     */
    public void setTrack_indicator_code(String track_indicator_code) {
        this.track_indicator_code = track_indicator_code;
    }

    /**
     * @return the cold_store_code
     */
    public String getCold_store_code() {
        return cold_store_code;
    }

    /**
     * @param cold_store_code the cold_store_code to set
     */
    public void setCold_store_code(String cold_store_code) {
        this.cold_store_code = cold_store_code;
    }

    /**
     * @return the season_code
     */
    public String getSeason_code() {
        return season_code;
    }

    /**
     * @param season_code the season_code to set
     */
    public void setSeason_code(String season_code) {
        this.season_code = season_code;
    }

    /**
     * @return the delivery_id
     */
    public Integer getDelivery_id() {
        return delivery_id;
    }

    /**
     * @param delivery_id the delivery_id to set
     */
    public void setDelivery_id(Integer delivery_id) {
        this.delivery_id = delivery_id;
    }


    public Boolean isGrower_commitment_required() {
        return grower_commitment_required;
    }

    public void setGrower_commitment_required(Boolean grower_commitment_required) {
        this.grower_commitment_required = grower_commitment_required;
    }

    public String getDp_tiplot() {
        return dp_tiplot;
    }

    public void setDp_tiplot(String dp_tiplot) {
        this.dp_tiplot = dp_tiplot;
    }

    public String getRipe_point_code() {
        return ripe_point_code;
    }

    public void setRipe_point_code(String ripe_point_code) {
        this.ripe_point_code = ripe_point_code;
    }

    public String getSize_code() {
        return size_code;
    }

    public void setSize_code(String size_code) {
        this.size_code = size_code;
    }

    public String getRmt_product_type_code() {
        return rmt_product_type_code;
    }

    public void setRmt_product_type_code(String rmt_product_type_code) {
        this.rmt_product_type_code = rmt_product_type_code;
    }

    public String getExit_ref() {
        return exit_ref;
    }

    public void setExit_ref(String exit_ref) {
        this.exit_ref = exit_ref;
    }

    public Integer getProduction_run_tipped_id() {
        return production_run_tipped_id;
    }

    public void setProduction_run_tipped_id(Integer production_run_tipped_id) {
        this.production_run_tipped_id = production_run_tipped_id;
    }

    public String getPc_code_num() {
        return pc_code_num;
    }

    public void setPc_code_num(String pc_code_num) {
        this.pc_code_num = pc_code_num;
    }

    public String getOrchard_code() {
        return orchard_code;
    }

    public void setOrchard_code(String orchard_code) {
        this.orchard_code = orchard_code;
    }
}
