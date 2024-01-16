<template>
<div id="container">
  <header>
    <nav>
      <RouterLink to="/">방만들기</RouterLink>
    </nav>
  </header>
  <RouterView/>
</div>
</template>

<script setup>
import { RouterView } from 'vue-router';
</script>

<style >

</style>
