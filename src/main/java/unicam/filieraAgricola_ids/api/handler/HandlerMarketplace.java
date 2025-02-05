package unicam.filieraAgricola_ids.api.handler;

import unicam.filieraAgricola_ids.api.gestori.GestoreMarketplace;
public abstract class HandlerMarketplace {
    private GestoreMarketplace gestoreMarketplace;

    public HandlerMarketplace() {
        this.gestoreMarketplace = GestoreMarketplace.getInstance();
    }

    public GestoreMarketplace getGM() {
        return gestoreMarketplace;
    }
}
