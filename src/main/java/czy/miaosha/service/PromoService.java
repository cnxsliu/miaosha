package czy.miaosha.service;

import czy.miaosha.service.model.PromoModel;

public interface PromoService {

    //根据itemId获取即将进行或正在进行的秒杀活动
    PromoModel getPromoByItemId(Integer itemId);

}
