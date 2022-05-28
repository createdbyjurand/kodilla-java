package com.createdbyjurand.shared.generate;

import com.createdbyjurand.shared.string_utils.StringUtils;

public interface Generate {
    /**
     * Generates random string from '0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ' character set.
     * <p>
     * minimum length of randomly generated id (default 4)
     * <p>
     * maximum length of randomly generated id (default 16)
     */
    static String id() {
        return id(4, 16);
    }

    /**
     * Generates random string from '0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ' character set.
     *
     * @param idMinimumLength (int) minimum length of randomly generated id (default 4)
     * @param idMaximumLength (int) maximum length of randomly generated id (default 16)
     */
    static String id(int idMinimumLength, int idMaximumLength) {
        int idLength = (int) Math.round(Math.random() * (idMaximumLength - idMinimumLength)) + idMinimumLength;
        String characterSet = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"; // 62 chars (3844)
        String id = "";
        for (int i = 0; i < idLength; i++) {
            id += characterSet.charAt((int) Math.floor(Math.random() * characterSet.length()));
        }
        return id;
    }

    static String sequence() {
        return sequence(4, 4, 8);
    }

    static String sequence(int blockMinimumLength, int blockMaximumLength, int blockNumber) {
        String id = "";
        for (int i = 0; i < blockNumber; i++) {
            id += id(blockMinimumLength, blockMaximumLength) + " ";
        }
        return StringUtils.chop(id);
    }
}
