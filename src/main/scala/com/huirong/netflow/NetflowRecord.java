package com.huirong.netflow;

import java.io.Serializable;

/**
 * 
 * @author yaoxin   
 * 
 * 2015年11月4日
 */
public class NetflowRecord implements Serializable{

	/**
	 * 204.122.154.133
	 * 72.1.176.125
	 * 24.246.189.137
	 *
	 *  212.78.76.129
	 *   136.2.35.178
	 *   160.55.227.84
	 *
	 */
	private static final long serialVersionUID = 9171471945904350327L;

	private Integer id;
	private String date;    // 偷懒, 用字符串表示日期
//	持续时间
	private Double duration;
//	协议类型
	private String protocol;
	private String srcIp;
	private String srcPort;
	private String dstIp;
	private String dstPort;
//	flag标记位
	private String flags;
//	协议编号
	private String tos;
//	包数量
	private Integer packets;
//	字节数
	private Long bytes;
//	每秒传送数据包数量
	private Integer pps;
//	平均数据包大小
	private Long bps;
	private Long bytespp;
	private Integer flows;
	private String tag = null;
	private String timeFrame;

	public String getTimeFrame() {
		return timeFrame;
	}

	public void setTimeFrame(String timeFrame) {
		this.timeFrame = timeFrame;
	}

	public NetflowRecord(String dt, double dura, String pro, String sip, String spt, String dip, String dpt, String fla,
                         String t, int packs, long sz, int p, long b, long bp, int flws){
		date = dt;
		duration = dura;
		protocol = pro;
		srcIp = sip;
		srcPort = spt;
		dstIp = dip;
		dstPort = dpt;
		flags = fla;
		tos = t;
		packets = packs;
		bytes = sz;
		pps = p;
		bps = b;
		bytespp = bp;
		flows = flws;
	}

	public Long getBps() {
		return bps;
	}

	public Long getBytes() {
		return bytes;
	}

	public Long getBytespp() {
		return bytespp;
	}

	public String getDate() {
		return date;
	}

	public String getDstIp() {
		return dstIp;
	}

	public String getDstPort() {
		return dstPort;
	}

	public Double getDuration() {
		return duration;
	}

	public String getFlags() {
		return flags;
	}

	public Integer getFlows() {
		return flows;
	}

	public Integer getId() {
		return id;
	}

	public Integer getPackets() {
		return packets;
	}

	public Integer getPps() {
		return pps;
	}

	public String getProtocol() {
		return protocol;
	}

	public String getSrcIp() {
		return srcIp;
	}

	public String getSrcPort() {
		return srcPort;
	}

	public String getTag() {
		return tag;
	}

	public String getTos() {
		return tos;
	}

	public void setBps(Long bps) {
		this.bps = bps;
	}

	public void setBytes(Long bytes) {
		this.bytes = bytes;
	}

	public void setBytespp(Long bytespp) {
		this.bytespp = bytespp;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setDstIp(String dstIp) {
		this.dstIp = dstIp;
	}

	public void setDstPort(String dstPort) {
		this.dstPort = dstPort;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	public void setFlags(String flags) {
		this.flags = flags;
	}

	public void setFlows(Integer flows) {
		this.flows = flows;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public void setPackets(Integer packets) {
		this.packets = packets;
	}
	public void setPps(Integer pps) {
		this.pps = pps;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	public void setSrcIp(String srcIp) {
		this.srcIp = srcIp;
	}
	public void setSrcPort(String srcPort) {
		this.srcPort = srcPort;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public void setTos(String tos) {
		this.tos = tos;
	}
	
	@Override
	public String toString(){
		return "date = " + date + ", duration = " + duration + ", protocol = " + protocol + 
				", srcIp = " + this.srcIp + ", srcPort = " + this.srcPort + ", dstIp = " + this.dstIp +
				", dstPort = " + this.dstPort + ", flags = " + this.flags + ", tos = " + this.tos +
				", packets = " + this.packets + ", bytes = " + this.bytes + ", pps = " + this.pps +
				", bbs = " + this.bps + ", bytespp = " + this.bytespp + ", flows = " + this.flows;
	}
}
