const path = require('path')
const resolve = dir => path.join(__dirname, dir)


module.exports = {
    //lintOnSave: false,
    chainWebpack: config => {
        config.resolve.alias.set('@', resolve('src'))
    },

    // webpack-dev-server 相关配置
    devServer: {
        port: 8085,
    },
    pluginOptions: {
        'style-resources-loader': {
            preProcessor: 'less',
            patterns: []
        }
    }
}
