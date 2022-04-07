import Vue from 'vue'
import Router from 'vue-router'
import Index from '@/pages/header/index/index'

Vue.use(Router);

export default new Router({
    routes: [
        {
            path: '/',
            redirect: '/index'
        },
        //主页
        {
            path: '/index',
            component: Index
        },
        // 博客
        {
            path: '/blog',
            component: () => import('@/pages/header/blog/blog.vue')
        },
        //壁纸
        {
            path: '/wallpaper',
            component: () => import('@/pages/header/wallpaper/wallpaper.vue')
        },
        // 漫画
        {
            path: '/cartoon',
            component: () => import('@/pages/header/cartoon/cartoon.vue')
        },
        // 论坛
        {
            path: '/forum',
            component: () => import('@/pages/header/forum/forum.vue')
        },
        // 问答
        {
            path: '/questions',
            component: () => import('@/pages/header/questions/questions.vue')
        },
        // 直播
        {
            path: '/live',
            component: () => import('@/pages/header/live/live.vue')
        },
         // 搜索
         {
            path: '/search',
            component: () => import('@/pages/header/search/searchIndex.vue')
        },
        // 登录
        {
            path: '/login',
            component: () => import('@/pages/header/user/login.vue')
        },
        // 注册 
        {
            path: '/register',
            component: () => import('@/pages/header/user/register.vue')
        },
       
        {
            path: '/video',
            component: () => import('@/pages/videoPlay/videoIndex.vue')
        },
        {
            path: '/editor',
            component: () => import('@/pages/editor/editorIndex.vue')
        },
        {
            path: '/category',
            component: () => import('@/pages/category/category.vue')
        },
        {
            path: '/activity',
            component: () => import('@/pages/activity/activity.vue')
        },

    ]
})