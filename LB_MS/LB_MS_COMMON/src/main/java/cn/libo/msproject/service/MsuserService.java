package cn.libo.msproject.service;

import cn.libo.msproject.entity.Msuser;
import cn.libo.msproject.vo.MsuserVo;

import java.util.List;

public interface MsuserService {

    public void insertMsuser(Msuser msuser);

    public Msuser queryMsuserById(int id);

    public void updateMsuser(Msuser msuser);

    public void deleteMsuserById(int id);

    public List<Msuser> queryMsuserByVo(MsuserVo msuserVo);

    public Msuser queryMsuserByuseraccount(String useraccount);
}
