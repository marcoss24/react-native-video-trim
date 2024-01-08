package com.videotrim.interfaces;

public interface VideoTrimListener {
  void onStartTrim();
  void onTrimmingProgress(int percentage);
  void onFinishTrim(String url);
  void onError();
  void onCancel();
}

public interface ConversionCallback {
  void onSuccess(String outputPath);
  void onFailure();
}
