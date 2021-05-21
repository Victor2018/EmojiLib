package org.victor.emoji.library;

public interface IEmoticonSelectedListener {
	void onEmojiSelected(String key);

	void onStickerSelected(String categoryName, String stickerName);
}
