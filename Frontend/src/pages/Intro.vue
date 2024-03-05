<template>
  <q-page class="q-pa-xl">
    <section class="q-mb-xl">
      <div class="text-h4">Intro</div>
      <q-separator class="q-my-md"/>
      <div class="target"></div>
    </section>
  </q-page>
</template>

<script setup>

</script>

<style lang="scss" scoped>
.target{
  height:200px;
  background-color: darkcyan;
}

// 일관성을 맞추기 위해 sass 변수 사용
// maxwidth가 500px일때 배경색이 빨강이 되도록.
@media (max-width: $breakpoint-xs-max){
  .target{
    background-color: red;
  }
}


</style>
