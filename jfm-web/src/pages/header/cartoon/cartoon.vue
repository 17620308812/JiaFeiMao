<template>
  <div style="margin-top: 50px;box-shadow: inset 0px 4px 4px 0px rgb(242 242 242);">
    <div style="display:flex;position:relative;height:400px;">
      <div style="left: 10%;" class="move-image" @click="handleMoveClick('left')">&lt;</div>
      <div class="move-image" @click="handleMoveClick('right')">></div>
      <div
        style="opacity: 0.5; background-color: black; z-index: 2;"
        class="move-item .move-image-left"
      ></div>
      <div
        style="opacity: 0.5; background-color: black; z-index: 2;left:50%"
        class="move-item .move-image-right"
      ></div>
      <div :class="['move-item',moveClass[item-1]]" v-for="item in 5" :key="item">
        <img
          :src="require('@/resource/index-scroll/index-scroll-'+item+'.jpg')"
          style="width: 100%; height: 100%;"
        />
      </div>
    </div>
    <div
      style="width: 100%;
    padding: 26px 0;
    font-size: 16px;
    color: #fff;
    background-color: #212121;"
    >
      <div style="justify-content: space-evenly;margin: auto;display:flex; max-width: 1200px;">
        <div
          v-for="item in [ '热血', '古风', '玄幻', '奇幻', '悬疑', '都市', '历史', '武侠仙侠', '游戏竞技', '悬疑灵异', '架空', '青春', '西幻', '现代', '全部 >']"
          :key="item"
        >{{item}}</div>
      </div>
    </div>
    <div>
        
    </div>
    <div
      style="    padding: 60px 0 16px;
    display: flex;
    align-items: center;
    color: rgba(0,0,0,.87);"
    >
      <div style="font-size: 32px;
    line-height: 45px;
    flex: 1;">为你推荐</div>
      <div
        style="height: 34px;
    width: 90px;
    background-color: rgba(50,170,255,.16);
    border-radius: 20px;
    font-size: 14px;
    display: flex;
    justify-content: center;
    align-items: center;
    line-height: 1;
    color: #32aaff;"
      >
        <div
          style="margin-right: 4px;
    width: 12px;
    height: 12px;
    background-image: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAAAAXNSR0IArs4c6QAAAxZJREFUSA21VU1IVFEUPufN6KgbcRGZWYsWZQiBjs+KaNUPudAoZ4ZKChcVZEQtQqiI0kWLIkpoURBZkITzYz+LwopAgmqokUIKqlU/JEa0KNPSN+/0ncfMNDJT6TSd4c67955zvu+8e847l+kPsjwoc38w+ZloFQlVE9Nsx1zoE55DQjRQ4KIr0WZ+/zsY+GbKiutS8X2CjgF0C0AKMi1+7TCThVXIbVB7NqIMAm9I/CJ0Dk5lGDYMbmFcJTdFiy0akRKyxseokg0yYdeE0Qg7A0RfEcyuQT/3YJ2SKQQAb4PRGUQOe7qDqHZHffw6ZZ1lUt8nCy2LuqBal1C3Dwb4hM5xxMUpAjMkG+NCEVVgsysW4H06n64guE68zWG1N5g2I8Ih26a7DoF5TebZE07SSoF+Ieaj7cyMl5mZeIPSDadWgI+B7Bu8ZxkKEZ+kDihKwdbf5KMduYA7oSygnQC/D/ASBdc9Y2lEKhHrNigsEOw9ymw7xjn88VtaBPCqdFdj0iYfonchsf1PAvwyXTmTuRmWatuie/BxIk/6ujFZqwuQhJObuTzjNhXhvDvTfXEUo24cTxXAtXJi6cqZzlGa6p+BoUkuVzCXmz7oM99iIPq4grosPaX8C74J+qywaCjz8w+PMkXYzxxgppr/QeBG/Q+gdhttIR8IuvNBUhuSgyie1UUeWs/eiMxBFt4pMGp2STTAL/6FxBuWKrHpuWKwiyqNWDMPo0Z7cFTIM50WEaQlN1FfgJ+Ct7bvXsV2elFRIR3AhvbzNXVh6sgNnsgM0xH4atsexXE4nTUVbW1QNuBNIom74GIhUdvDAI9Ph6zhpng+jtJZBNiq9i6Dtj728WWdpwh0gZ6+B0ZdCZKnyEnL33KyrE8WT1h0Ce6mYuAk9sf8fFLnKlMIdKMuKNr8zmPo3SD49cPoBq7IR54CGkGe4mjvFdivR/U1IWMNiYC+GLgBk5ErlkoGgW6aQSnH530cyk0gms6l3+sx6NCDZn6j/umSlSBpoES49VuwXokoaxBOGZ5KOIzxCuO2x0WRbMDQOfITQ9UJmSVQi4gAAAAASUVORK5CYII=);
    background-size: contain;
    background-repeat: no-repeat;"
        ></div>
        <div style>换一批</div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Cartoon",
  data() {
    return {
      moveClass: [
        "move-image-left-left",
        "move-image-left",
        "move-image-middle",
        "move-image-right",
        "move-image-right-right"
      ]
    };
  },
  methods: {
    handleMoveClick(type) {
      if (type === "left") {
        this.moveClass.unshift(this.moveClass[this.moveClass.length - 1]);
        this.moveClass.splice(this.moveClass.length - 1, 1);
      } else if (type === "right") {
        this.moveClass.push(this.moveClass[0]);
        this.moveClass.splice(0, 1);
      }
    }
  }
};
</script>

<style scoped>
.move-image {
  color: white;
  left: 90%;
  position: absolute;
  z-index: 3;
  top: 50%;
  width: 70px;
  height: 70px;
  text-align: center;
  font-size: 50px;
  top: 45%;
  background-color: rgba(0, 0, 0, 0.3);
  border-radius: 70px;
  cursor: pointer;
}
.move-item {
  transition: all 0.5s;
  width: 50%;
  height: 400px;
  position: absolute;
}

.move-image-left-left {
  z-index: 0;
  left: -50%;
}
.move-image-left {
  z-index: 1;
  left: 0%;
}

.move-image-middle {
  z-index: 3;
  transform: translate(-50%, 0%);
  left: 50%;
}

.move-image-right {
  z-index: 1;
  left: 50%;
}
.move-image-right-right {
  z-index: 0;
  left: 100%;
}

.el-carousel__item h3 {
  color: #475669;
  font-size: 14px;
  opacity: 0.75;
  line-height: 200px;
  margin: 0;
}

.el-carousel__item:nth-child(2n) {
  background-color: #99a9bf;
}

.el-carousel__item:nth-child(2n + 1) {
  background-color: #d3dce6;
}
</style>