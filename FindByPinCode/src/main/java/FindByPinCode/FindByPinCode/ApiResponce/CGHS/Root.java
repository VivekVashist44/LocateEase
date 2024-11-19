package FindByPinCode.FindByPinCode.ApiResponce.CGHS;

import java.sql.Date;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Root{
    public String index_name;
    public String title;
    public String desc;
    public String created;
    public int updated;
    public Date created_date;
    public Date updated_date;
    public String active;
    public String visualizable;
    public String catalog_uuid;
    public String source;
    public String org_type;
    public ArrayList<String> org;
    public ArrayList<String> sector;
    public ArrayList<Field> field;
    public TargetBucket target_bucket;
    public String message;
    public String version;
    public String status;
    public int total;
    public int count;
    public String limit;
    public String offset;
    public ArrayList<Record> records;
    
	public String getIndex_name() {
		return index_name;
	}
	public void setIndex_name(String index_name) {
		this.index_name = index_name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public int getUpdated() {
		return updated;
	}
	public void setUpdated(int updated) {
		this.updated = updated;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public Date getUpdated_date() {
		return updated_date;
	}
	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getVisualizable() {
		return visualizable;
	}
	public void setVisualizable(String visualizable) {
		this.visualizable = visualizable;
	}
	public String getCatalog_uuid() {
		return catalog_uuid;
	}
	public void setCatalog_uuid(String catalog_uuid) {
		this.catalog_uuid = catalog_uuid;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getOrg_type() {
		return org_type;
	}
	public void setOrg_type(String org_type) {
		this.org_type = org_type;
	}
	public ArrayList<String> getOrg() {
		return org;
	}
	public void setOrg(ArrayList<String> org) {
		this.org = org;
	}
	public ArrayList<String> getSector() {
		return sector;
	}
	public void setSector(ArrayList<String> sector) {
		this.sector = sector;
	}
	public ArrayList<Field> getField() {
		return field;
	}
	public void setField(ArrayList<Field> field) {
		this.field = field;
	}
	public TargetBucket getTarget_bucket() {
		return target_bucket;
	}
	public void setTarget_bucket(TargetBucket target_bucket) {
		this.target_bucket = target_bucket;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	public String getOffset() {
		return offset;
	}
	public void setOffset(String offset) {
		this.offset = offset;
	}
	public ArrayList<Record> getRecords() {
		return records;
	}
	public void setRecords(ArrayList<Record> records) {
		this.records = records;
	}
    
}