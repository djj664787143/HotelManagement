package com.hotelsystem.dao;

import java.util.List;

import com.hotelsystem.bean.ReserveRoomBean;

/**
 * 房间预定表
 * @ClassName: IReserveRoomDao 
 * @Description: TODO
 * @author jhz
 * @date 2018年8月4日 下午2:36:24 
 * @version v1.0
 */
public interface IReserveRoomDao {
	/**
	 * 
	 * @Title: insertReserveRoom 
	 * @Description: TODO
	 * @param @param bean
	 * @return void
	 * @throws
	 */
	public void insertReserveRoom(ReserveRoomBean bean);
	/**
	 * 
	 * @Title: updateReserveRoom 
	 * @Description: TODO
	 * @param @param bean
	 * @return void
	 * @throws
	 */
	public void updateReserveRoom(ReserveRoomBean bean);
	/**
	 * 
	 * @Title: deleteReserveRoom 
	 * @Description: TODO
	 * @param @param bean
	 * @return void
	 * @throws
	 */
	public void deleteReserveRoom(ReserveRoomBean bean);
	/**
	 * 
	 * @Title: findReserveRoomByPeopleId 
	 * @Description: TODO
	 * @param @param reservePeopleId
	 * @param @return
	 * @return List<ReserveRoomBean>
	 * @throws
	 */
	public List<ReserveRoomBean> findReserveRoomByPeopleId(int reservePeopleId);
	/**
	 * 
	 * @Title: findReserveRoomByRoomId 
	 * @Description: TODO
	 * @param @param reserveRoomId
	 * @param @return
	 * @return ReserveRoomBean
	 * @throws
	 */
	public ReserveRoomBean findReserveRoomByRoomId(String reserveRoomId);
	
}
