package com.el.base.design.state.test;

/**
 * @author Roman.zhang
 * @Date: 2019/7/9 10:46
 * @Version:V1.0
 * @Description:DispenseState 发放奖品的状态
 */
public class DispenseState extends State {
    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("不能扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        if(activity.getCount()>0){
            System.out.println("恭喜你中奖了");
            activity.setState(activity.getNoRafflleState());
        }else{
            System.out.println("很遗憾，奖品发送完了");

            activity.setState(activity.getDispensOutState());
        }
    }
}
