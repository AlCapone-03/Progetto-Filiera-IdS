package unicam.filieraAgricola_ids.api.handler;

import unicam.filieraAgricola_ids.api.gestori.GestoreMarketplace;
public abstract class ControllerMarketplace {
    private GestoreMarketplace gestoreMarketplace;

    public ControllerMarketplace(GestoreMarketplace gestoreMarketplace) {
        this.gestoreMarketplace = gestoreMarketplace;
    }
}
