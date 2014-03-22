package com.savefon.popcorntime.test;

/**
 * Helper for Mockito-based test cases.
 */
public final class MockitoHelper {
    /**
     * The system property that stores the location of the cache directory for dexmaker.
     */
    private static final String DEXMAKER_CACHE_DIR_PROPERTY = "dexmaker.dexcache";
    private String originalCacheDir;

    public void setUp(String cacheDir) throws Exception {
        originalCacheDir = System.getProperty(DEXMAKER_CACHE_DIR_PROPERTY);
        //noinspection ConstantConditions
        System.setProperty(DEXMAKER_CACHE_DIR_PROPERTY, cacheDir);
    }

    public void tearDown() throws Exception {
        // Restore the original value of the system property
        if (originalCacheDir != null) {
            System.setProperty(DEXMAKER_CACHE_DIR_PROPERTY, originalCacheDir);
        } else {
            System.clearProperty(DEXMAKER_CACHE_DIR_PROPERTY);
        }
    }
}
