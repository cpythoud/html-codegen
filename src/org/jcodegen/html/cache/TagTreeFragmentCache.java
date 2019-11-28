package org.jcodegen.html.cache;

import org.jcodegen.html.Tag;

import java.util.concurrent.ExecutorService;

public abstract class TagTreeFragmentCache {

    private final ExecutorService executorService;

    private String cachedData;

    protected TagTreeFragmentCache(ExecutorService executorService) {
        this.executorService = executorService;
    }

    public boolean dataAvailable() {
        return cachedData != null;
    }

    public void refreshData() {
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                if (cachedData == null)
                    cachedData = getContainerTag().toString();
            }
        });
    }

    public String getData() {
        if (dataAvailable())
            return cachedData;

        refreshData();
        return getPlaceHolderContainerTag().toString();
    }

    protected abstract Tag getContainerTag();

    protected abstract Tag getPlaceHolderContainerTag();
}
