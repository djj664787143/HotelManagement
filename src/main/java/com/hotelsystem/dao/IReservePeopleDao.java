package com.hotelsystem.dao;

import com.hotelsystem.bean.ReservePeopleBean;

/**
 * 预订人信息表
 * @ClassName: IReservePeopleDao 
 * @Description: TODO
 * @author jhz
 * @date 2018年8月4日 下午2:35:38 
 * @version v1.0
 */
public interface IReservePeopleDao {
	/**
	 * 
	 * @Title: findReservePeopleByPeopleName 
	 * @Description: TODO
	 * @param @param reservePeopleName
	 * @param @return
	 * @return ReservePeopleBean
	 * @throws
	 */
	public ReservePeopleBean findReservePeopleByPeopleName(String reservePeopleName);
	/**
	 * 
	 * @Title: findReservePeopleByPeopleId 
	 * @Description: TODO
	 * @param @param reservePeopleId
	 * @param @return
	 * @return ReservePeopleBean
	 * @throws
	 */
	public ReservePeopleBean findReservePeopleByPeopleId(int reservePeopleId);
	/**
	 * 
	 * @Title: insertReservePeople 
	 * @Description: TODO
	 * @param @param bean
	 * @param @return
	 * @return int
	 * @throws
	 */
	public int insertReservePeople(ReservePeopleBean bean);
	/**
	 * 
	 * @Title: updateReservePeople 
	 * @Description: TODO
	 * @param @param bean
	 * @return void
	 * @throws
	 */
	public void updateReservePeople(ReservePeopleBean bean);
	/**
	 * 
	 * @Title: deleteReservePeople 
	 * @Description: TODO
	 * @param @param bean
	 * @return void
	 * @throws
	 */
	public void deleteReservePeople(ReservePeopleBean bean);
}
