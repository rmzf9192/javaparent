package com.el.base.design.adapter;

/**
 * @author roman zhangfei
 * @Date 2019/12/18 15:23
 * @Version V1.0
 *   类的适配器
 */
//public class VoltageAdapter extends VOltage220v implements IVOltage5v {
public class VoltageAdapter  implements IVOltage5v {
    private VOltage220v vOltage220v ;

    public VoltageAdapter(VOltage220v vOltage220v) {
        this.vOltage220v = vOltage220v;
    }
    @Override
    public int input5v() {
        final int i = vOltage220v.output220v();
        int v = i / 44;
        return v;
    }
}