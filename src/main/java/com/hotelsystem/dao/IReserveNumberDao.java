package com.hotelsystem.dao;

import java.util.List;

import com.hotelsystem.bean.ReserveNumberBean;

/**
 * 预定数量表
 * @ClassName: IReserveNumberDao 
 * @Description: TODO
 * @author jhz
 * @date 2018年8月4日 下午2:31:33 
 * @version v1.0
 */
public interface IReserveNumberDao {
	/**
	 * 
	 * @Title: insertReserveNumber 
	 * @Description: TODO
	 * @param @param bean
	 * @return void
	 * @throws
	 */
	public void insertReserveNumber(ReserveNumberBean bean);
	/**
	 * 
	 * @Title: updateReserveNumber 
	 * @Description: TODO
	 * @param @param bean
	 * @return void
	 * @throws
	 */
	public void updateReserveNumber(ReserveNumberBean bean);
	/**
	 * 
	 * @Title: deleteReserveNumber 
	 * @Description: TODO
	 * @param @param bean
	 * @return void
	 * @throws
	 */
	public void deleteReserveNumber(ReserveNumberBean bean);
	/**
	 * 
	 * @Title: findReserveNumberByRoomId 
	 * @Description: TODO
	 * @param @param reserveRoomId
	 * @param @return
	 * @return List<ReserveNumberBean>
	 * @throws
	 */
	public List<ReserveNumberBean> findReserveNumberByRoomId(String reserveRoomId);
	/**
	 * 
	 * @Title: findReserveCountByTypeId 
	 * @Description: TODO
	 * @param @param roomTypeId
	 * @param @return
	 * @return int
	 * @throws
	 */
	public int findReserveCountByTypeId(int roomTypeId);
}
