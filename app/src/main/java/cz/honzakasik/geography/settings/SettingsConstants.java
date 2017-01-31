package cz.honzakasik.geography.settings;

import java.util.Locale;

public interface SettingsConstants {

    Locale CZECH_LOCALE = new Locale("cs");
    Locale[] AVAILABLE_TRANSLATIONS = new Locale[]{Locale.ENGLISH, CZECH_LOCALE};
}
