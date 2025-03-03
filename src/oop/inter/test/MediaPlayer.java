package oop.inter.test;

public class MediaPlayer {
    private MediaPlayable[] mediaList = new MediaPlayable[0];

    public void addMedia(MediaPlayable media) {
        // 주어진 media를 mediaList배열에 추가
        if(media == null) return;

        // 새로운 배열 생성 (크기 1 증가)
        MediaPlayable[] newMediaList = new MediaPlayable[mediaList.length + 1];

        // 기존 배열 복사
        System.arraycopy(mediaList, 0, newMediaList, 0, mediaList.length);

        // 새 미디어 추가
        newMediaList[mediaList.length] = media;

        // mediaList를 새 배열로 교체
        mediaList = newMediaList;
    }

    public void playAll() {
        // 반복문을 통해 mediaList에 있는 모든 미디어들을 재생시킴
        for (MediaPlayable mediaPlayable : mediaList) { // 배열 범위 초과 방지
            mediaPlayable.play(); // MediaPlayable이 play() 메서드를 갖고 있다고 가정
        }
    }
}
