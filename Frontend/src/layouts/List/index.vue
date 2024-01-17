<template>
        <q-layout view="hHh lpR lFf">
            <ListHeader/>

            <ListDrawer/>

            <ListContent/>
        </q-layout>
</template>

<script setup>
import ListHeader from './ListHeader.vue'
import ListDrawer from './ListDrawer.vue'
import ListContent from './ListContent.vue'
</script>

<style lang="scss" scoped>

</style>