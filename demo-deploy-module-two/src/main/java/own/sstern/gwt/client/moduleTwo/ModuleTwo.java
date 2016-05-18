package own.sstern.gwt.client.moduleTwo;

import java.util.logging.Logger;

import com.google.gwt.core.client.EntryPoint;

public class ModuleTwo implements EntryPoint {

    private static final Logger log = Logger.getLogger(ModuleTwo.class.getName());

    @Override
    public void onModuleLoad() {
        log.info("Application loading");
    }
}
