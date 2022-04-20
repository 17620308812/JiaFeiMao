<template>
    <div style="margin-top: 50px;box-shadow: inset 0px 4px 4px 0px rgb(242 242 242);">
        <div style="display:flex">
            <div></div>
            <div></div>
        </div>
        <h1 class="animate__animated animate__fadeIn" v-if="show">An animated element</h1>
        <el-button @click="show = !show">Button</el-button>
    </div>
</template>

<script>
export default {
    name:"DownloadApp",
    data(){
        return {
            show:true
        }
    }
}
</script>

<style scoped>

</style>