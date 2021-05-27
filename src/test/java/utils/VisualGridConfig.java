package utils;

import com.applitools.eyes.selenium.BrowserType;
import com.applitools.eyes.selenium.Configuration;
import com.applitools.eyes.visualgrid.model.DeviceName;
import com.applitools.eyes.visualgrid.model.ScreenOrientation;

public class VisualGridConfig {

    public static Configuration getGrid(){
        Configuration vgConfig = new Configuration();

        //Browsers
        vgConfig.addBrowser(800,  600, BrowserType.FIREFOX);
        vgConfig.addBrowser(800,  600, BrowserType.CHROME);
        vgConfig.addBrowser(1200, 800, BrowserType.FIREFOX);
        vgConfig.addBrowser(1200, 800, BrowserType.CHROME);
        vgConfig.addBrowser(1200, 800, BrowserType.SAFARI);
        vgConfig.addBrowser(800,  600, BrowserType.SAFARI);
        vgConfig.addBrowser(1200, 800, BrowserType.EDGE_CHROMIUM);
        vgConfig.addBrowser(800,  600, BrowserType.EDGE_CHROMIUM);

        //Devices
        vgConfig.addDeviceEmulation(DeviceName.iPhone_X);
        vgConfig.addDeviceEmulation(DeviceName.iPhone_X, ScreenOrientation.LANDSCAPE);
        vgConfig.addDeviceEmulation(DeviceName.Galaxy_S5);
        vgConfig.addDeviceEmulation(DeviceName.Galaxy_S5, ScreenOrientation.LANDSCAPE);

        return vgConfig;
    }
}