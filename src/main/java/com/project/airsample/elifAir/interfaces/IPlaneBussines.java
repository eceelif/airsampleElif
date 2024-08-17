package com.project.airsample.elifAir.interfaces;

public interface IPlaneBussines {

    /**
     * Uçaklarla ilgili belirli bir iş mantığını uygulayan bir metod.
     *
     * @param id Uçağın ID'si
     * @param city Şehir adı
     * @return İşlem sonucunu belirten bir boolean değeri
     */
    boolean someLogicForPlane(int id, String city);

    /**
     * Diğer bir iş mantığı uygulayan metod.
     *
     * @param id Uçağın ID'si
     * @param city Şehir adı
     * @return İşlem sonucunu belirten bir boolean değeri
     */
    boolean someOtherPlaneLogic(int id, String city);

    /**
     * Ekstra bir iş mantığı uygulayan metod.
     *
     * @param id Uçağın ID'si
     * @param city Şehir adı
     * @return İşlem sonucunu belirten bir boolean değeri
     */
    boolean yetAnotherPlaneLogic(int id, String city);
}
